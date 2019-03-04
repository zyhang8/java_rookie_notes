package test_mysql;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;
class Listener implements ActionListener{
	JLabel mlab;
	JTextField txt1,txt2;
	JButton bt1,bt2;
	Listener(JLabel a,JTextField b,JTextField c,JButton d,JButton e){
		 mlab=a;
		 txt1=b;
		 txt2=c;
		 bt1=d;
		 bt2=e;
	}
	public void actionPerformed(ActionEvent e) {
		if((JButton)e.getSource()==bt1) {
			String un=txt1.getText();
			String pw=txt2.getText();
			int uid=Integer.parseInt(un);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=gbk&serverTimezone=GMT%2B8&useSSL=false";
				String user="ylin";
				String pwd="ylin";
				Connection conn=DriverManager.getConnection(url, user, pwd);
				Statement stmt=conn.createStatement();
				String sql="select * from stu";
				ResultSet rs = stmt.executeQuery(sql);
//				String strout="";
				boolean b=false;
//				int cnt=0;
				while(rs.next()) {
					int sno=rs.getInt("id");
					String rpw=rs.getString("name");
					if(sno==uid&&pw.endsWith(rpw)) {
						mlab.setText("welcome");
						b=true;
						break;
					}
					System.out.println(sno);
					System.out.println(rpw);
				}
					if(!b) {
						mlab.setText("false");
					}
					rs.close();
					stmt.close();
			}
			catch(Exception e1){
				mlab.setText("数据库访问异常");
				System.out.println(e1.getMessage()+e1.getCause());
			
			}
		}
		else{
			txt1.setText("");
			txt2.setText("");
		}
	}
}
public class Login {
JFrame f1;
Container con;
Box b,b1,b2,b3,b4;
JLabel lab1,lab2,lab3;
JTextField txt1,txt2;
JButton btn1,btn2;
public Login(int w,int h) {
	init(w,h);
}
public void init(int w,int h) {
	f1=new JFrame("Login to parad");
	f1.setSize(w, h);
	con=f1.getContentPane();
	b=Box.createVerticalBox();
	b1=Box.createVerticalBox();
	b2=Box.createVerticalBox();
	b3=Box.createVerticalBox();
	b4=Box.createHorizontalBox();	
	lab3=new JLabel();
	b4.add(lab3);
	txt1=new JTextField(10);
	txt2=new JTextField(10);
	lab1=new JLabel("user:");
	lab2=new JLabel("password:");
	btn1=new JButton("submit");
	btn2=new JButton("cancel");
	Listener lis1=new Listener(lab3,txt1,txt2,btn1,btn2);
	btn1.addActionListener(lis1);
	btn2.addActionListener(lis1);
	b1.add(lab1);
	b1.add(txt1);
	b2.add(lab2);
	b2.add(txt2);
	b3.add(btn1);
	b3.add(btn2);
	b.add(b1);
	b.add(b2);
	b.add(b3);
	b.add(b4);
	
	con.setLayout(new FlowLayout());
	con.add(b);
	f1.setVisible(true);
}
}
