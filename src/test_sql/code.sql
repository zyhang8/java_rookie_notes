--sql�����ݿ⹹������,word���ƹ����Ŀ���������,��ӭ����.--ylin
--����
if exists(select * from master.dbo.sysdatabases where name = 'Warehouse_management')
drop database Warehouse_management  --�ж����ݿ��Ƿ����,��������ɾ��

go
create database Warehouse_management;--�������ݿ�

go
use Warehouse_management;

create table Stock
(--�����ֿ����
[ProductNumber] int not null identity primary key,--��Ʒ���[id] int not null identity primary key 
ProductName varchar(20) not null,--��Ʒ��
StockAmount int not null,--�������
Spec varchar(20),--��Ʒ���
Unit char(5),--��Ʒ��λ
price float,--�ۼ�
remark varchar(50)--��ע��Ϣ
);

create table Supplier
(--������Ӧ�̱�
ProviderNumber char(15) primary key,--��Ӧ�̱��
ProviderName varchar(20) not null,--����Ʒ����


);
create table Product_in
(--������������
[Number_in] int identity primary key,--�������[id] int not null identity primary key 
ProductNumber char(10)not null,--��Ʒ���
ProductName varchar(20) not null,--��Ʒ��
Spec varchar(20),--��Ʒ���
Unit char(5),--��Ʒ��λ
price_in float,--������
amount_in int not null,--��������
timeKeeper datetime default getdate()
);

create table Product_out
(--������������
[Number_out] int identity primary key,--�������
ProductNumber char(10)not null,--��Ʒ���
ProductName varchar(20) not null,--��Ʒ��
Spec varchar(20),--��Ʒ���
Unit char(5),--��Ʒ��λ
price_out float,--������
amount_out int not null,--��������
timeKeeper datetime default getdate()--��¼����ʱ��
);

create table Customer
(--�����˿ͱ�
Cus_Number char(10) primary key,--�˿ͱ��
Cus_Name varchar(20) not null,--�˿�����
sex char(2),--�Ա�
phone char(11),--�ֻ���ϵ��ʽ

);
create table Quote
(--�������۹�ϵ��
ProviderNumber char(15) not null,--��Ӧ�̱��
ProductNumber char(10) primary key(ProviderNumber,ProductNumber),--��Ʒ���
price_in float,--������

);

--����
Insert into Stock
Values( '���', 20, '���ľ', '��', 40, '�����ײ����κ�' ),
( '������ë��', 100, '100%����', '��', 30, '��'),
('��SOD����˪', 30, '������Ϲ�', '��',25, '��'),
( '���������ֽ',200, '205mm*210mm*8Ƭ', '��', 1,'���ʱ��ѹ'),
( '�м�' , 10,  '����ľ ', '̨',250, '��'  ),
(  '��Ƭ��', 8, '��ľ','��',100,  '��մˮ'  ),
( 'ֽ���', 32,  '���ľ', '��',50,'��'  ),

(   '����', 22, '���', '��', 2000, '��' ),
(   '��Ͳ',42,'��ľ','��',55,'��մˮ' ),
(  '����',13,'����֦','��',100,'��' ),
(  '������',36,'���ľ','��',245,'��' ),
(  '����',35,'����ľ','��',100,'��'),
(  '���ˮ',56,'��ɫƿ500ml','ƿ',28,'��������ֱ��')



Insert into Supplier
Values('1', '���������Ʒ���޹�˾'),
('2',  '�����Ҿ�'),
('3',  '�����޹�˾'),
('4',  '�ݶ�˹�������޹�˾'),
('5',  'ϯ��˼���޹�˾')



Insert into Customer
Values('1', '�򽨹�','��','13817657373'),
('2', '�븻��','��','18937656453'),
('3', '�����','��','13765434587'),
('4', '������','Ů','18967899876'),
('5', '������','��','13818767753')

insert into Quote
values('1',1,40),
('2',1,35),
('3',1,39),
('4',1,41),
('5',1,43),
('1',2,30),
('2',2,29),
('3',2,28),
('4',2,31),
('5',2,35),
('1',3,25),
('2',3,26),
('3',3,27),
('4',3,29),
('5',3,31),
('1',4,1),
('2',4,0.5),
('3',4,0.6),
('4',4,1.1),
('5',4,1.3),
('1',5,250),
('2',5,200),
('3',5,220),
('4',5,180),
('5',5,210)

--������
--1�洢���̣����ı�
go
create procedure num_change
@id char(10),
@num int
as
update Stock set StockAmount=StockAmount+@num 
where ProductNumber=@id
Go

--���ۼ����
use Warehouse_management
go
create trigger out_strock_trigger
on Product_out
after insert
as
begin
declare @num int,@id char(10)
select @num =amount_out from inserted
set @num=0-@num
select @id = ProductNumber from inserted
exec num_change @id,@num
end
go 

--�����ӿ��
use Warehouse_management
go
create trigger in_strock_trigger
on Product_in
after insert
as
begin
declare @num int,@id char(10)
select @num =amount_in from inserted
select @id = ProductNumber from inserted
exec num_change @id,@num
end
go 

--���ݽ����޸��ۼ�
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE XTYPE = 'TR' AND NAME = 'UpdateStockPrice') 
DROP TRIGGER UpdateStockPrice
GO 

CREATE TRIGGER UpdateStockPrice 
ON Product_in 
FOR INSERT 
AS 
BEGIN TRANSACTION 

DECLARE @ProductNumber char(10) 
SET @ProductNumber = (SELECT ProductNumber FROM INSERTED) 

DECLARE @price_in int 
SET @price_in = (SELECT price_in FROM INSERTED) 

UPDATE Stock 
SET price = 1.5*@price_in
WHERE ProductNumber = @ProductNumber 
COMMIT TRANSACTION 
GO 

--���С��Ĭ��ֵ��15������
  if object_id('checkStockAmount', 't') is not null
    drop trigger checkStockAmount
go
create trigger checkStockAmount
on Stock
    for insert,update
as
    declare @ProductNumber int,@StockAmount int;
    select @ProductNumber=ProductNumber,@StockAmount=StockAmount from inserted;
     
    if @StockAmount<15
	/* update Stock set StockAmount=100 where @ProductNumber=ProductNumber*/
   

        insert into Product_in(ProductNumber,ProductName,price_in,amount_in)
select Stock.ProductNumber,ProductName,min(price_in),20 from Quote,Stock
where Stock.ProductNumber=@ProductNumber
group by Stock.ProductNumber,ProductName
   
Go

--���������ۼ۵�����5��
IF EXISTS (SELECT NAME FROM SYSOBJECTS WHERE XTYPE = 'TR' AND NAME = 'Sale') 
DROP TRIGGER Sale
GO 

CREATE TRIGGER Sale 
ON Product_out 
FOR INSERT 
AS 
BEGIN TRANSACTION 

DECLARE @ProductNumber int 
SET @ProductNumber = (SELECT ProductNumber FROM INSERTED) 

DECLARE @price_out int 
SET @price_out = (SELECT price_out FROM INSERTED) 

DECLARE @amount_out int 
SET @amount_out = (SELECT amount_out FROM INSERTED) 

IF @amount_out>5
UPDATE Product_out 
SET price_out = 0.8*@price_out
WHERE ProductNumber = @ProductNumber 
COMMIT TRANSACTION 
GO 

CREATE VIEW see_stock AS
select productname,stockamount,unit from stock
go
go
create procedure add_commodity
@a varchar(20),
@b int,
@c char(5),
@d float,
@e varchar(50)
as
Insert into Stock
Values (@a,@b,'null',@c,@d,@e)
Go