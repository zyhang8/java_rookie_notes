--sql端数据库构建代码,word复制过来的可能有问题,欢迎报错.--ylin
--建表
if exists(select * from master.dbo.sysdatabases where name = 'Warehouse_management')
drop database Warehouse_management  --判断数据库是否存在,若存在则删除

go
create database Warehouse_management;--创建数据库

go
use Warehouse_management;

create table Stock
(--创建仓库库存表
[ProductNumber] int not null identity primary key,--商品编号[id] int not null identity primary key 
ProductName varchar(20) not null,--商品名
StockAmount int not null,--库存数量
Spec varchar(20),--商品规格
Unit char(5),--商品单位
price float,--售价
remark varchar(50)--备注信息
);

create table Supplier
(--创建供应商表
ProviderNumber char(15) primary key,--供应商编号
ProviderName varchar(20) not null,--供商品名字


);
create table Product_in
(--创建进货报表
[Number_in] int identity primary key,--进货编号[id] int not null identity primary key 
ProductNumber char(10)not null,--商品编号
ProductName varchar(20) not null,--商品名
Spec varchar(20),--商品规格
Unit char(5),--商品单位
price_in float,--进货价
amount_in int not null,--进货数量
timeKeeper datetime default getdate()
);

create table Product_out
(--创建出货报表
[Number_out] int identity primary key,--出货编号
ProductNumber char(10)not null,--商品编号
ProductName varchar(20) not null,--商品名
Spec varchar(20),--商品规格
Unit char(5),--商品单位
price_out float,--出货价
amount_out int not null,--出货数量
timeKeeper datetime default getdate()--记录插入时间
);

create table Customer
(--创建顾客表
Cus_Number char(10) primary key,--顾客编号
Cus_Name varchar(20) not null,--顾客名字
sex char(2),--性别
phone char(11),--手机联系方式

);
create table Quote
(--创建报价关系表
ProviderNumber char(15) not null,--供应商编号
ProductNumber char(10) primary key(ProviderNumber,ProductNumber),--商品编号
price_in float,--进货价

);

--插入
Insert into Stock
Values( '茶盒', 20, '田黄木', '个', 40, '易碎易产生刮痕' ),
( '洁丽雅毛巾', 100, '100%纯棉', '条', 30, '无'),
('大宝SOD滋润霜', 30, '红白塑料罐', '罐',25, '无'),
( '朵朵云卫生纸',200, '205mm*210mm*8片', '包', 1,'存放时勿挤压'),
( '承架' , 10,  '阿瑞木 ', '台',250, '无'  ),
(  '唱片盒', 8, '红木','个',100,  '勿沾水'  ),
( '纸巾盒', 32,  '田黄木', '个',50,'无'  ),

(   '屏风', 22, '翡翠', '个', 2000, '无' ),
(   '笔筒',42,'红木','个',55,'勿沾水' ),
(  '刀尺',13,'白酸枝','套',100,'无' ),
(  '电脑桌',36,'田黄木','个',245,'无' ),
(  '拐杖',35,'阿瑞木','根',100,'无'),
(  '啫喱水',56,'蓝色瓶500ml','瓶',28,'避免阳光直射')



Insert into Supplier
Values('1', '多多云日用品有限公司'),
('2',  '永琪家居'),
('3',  '大宝有限公司'),
('4',  '拜尔斯道夫有限公司'),
('5',  '席梦思有限公司')



Insert into Customer
Values('1', '沈建国','男','13817657373'),
('2', '齐富贵','男','18937656453'),
('3', '徐百岁','男','13765434587'),
('4', '贺美丽','女','18967899876'),
('5', '刘建军','男','13818767753')

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

--触发器
--1存储过程：库存改变
go
create procedure num_change
@id char(10),
@num int
as
update Stock set StockAmount=StockAmount+@num 
where ProductNumber=@id
Go

--销售减库存
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

--进货加库存
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

--根据进价修改售价
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

--库存小于默认值（15）进货
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

--批量购买售价调整（5）
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