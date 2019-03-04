package test_sql;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class SQL {
	Statement stmt;
	Connection dbConn;
	SQL(){
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	    String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Warehouse_management";
	    String userName = "sa";
	    String userPwd = "ylin";
	    dbConn = null;
		try {
			Class.forName(driverName);
			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
			stmt=dbConn.createStatement();
			System.out.println("连接数据库成功");
		}
		catch(Exception e1){
			System.out.println(e1.getMessage()+e1.getCause());
		}
	}
	ResultSet exe(String a) {
		try {
			return stmt.executeQuery(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	PreparedStatement pre_exe(String a) {
		try {
			return dbConn.prepareStatement(a,Statement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	@Override
	protected void finalize(){
	    System.out.println("in finalize");
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Login {
	// 程序所需控件
	// *********************************************
	JFrame frame;
	SQL sql=new SQL();
	// 上边面板的控件
	JButton btn_1, btn_2, btn_3;
	JMenuBar panel_head;
	JPanel  panel_1, panel_2, panel_3;
	// 下面第一个面板的控件
	JButton btn_submit;
	JLabel stock_amount, pn, label_mark,label_dscr,price;
	JTextField t_stock_amount, tn, text_mark, text_sta,t_label_dscr,t_price;
	// 下面第二个面板的控件
	JLabel list_dscr;
	String str[];
	JList<String> list;
	JScrollPane sp;
	// 下面第三个面板的控件
	JLabel l1,l2;
	JTextField t1,t2,t3;
	JButton btn;
public Login(int w,int h) {
	// ********************************
	// 第二步设置 底层窗口属性
	// ********************************
	// 得到当前屏幕的尺寸
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
	int screenWidth = screenSize.width;
	int screenHeight = screenSize.height;
	// frame指底层窗口
	frame = new JFrame("stock");
	frame.setBounds(screenWidth / 3, screenHeight / 4, 500, 400); // 设置位置及大小
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false); // 设置窗口大小不可变
	
	panel_head = new JMenuBar();
	panel_head.setLayout(new FlowLayout());
	btn_1 = new JButton("添加商品");
	btn_1.setPreferredSize(new Dimension(100,30));
	panel_head.add(btn_1);
	btn_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel_1.setVisible(true);
			panel_2.setVisible(false);
			panel_3.setVisible(false);
		}
	});

	btn_2 = new JButton("库存查看");
	btn_2.setPreferredSize(new Dimension(100,30));
	panel_head.add(btn_2);
	btn_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel_1.setVisible(false);
			panel_2.setVisible(true);
			panel_3.setVisible(false);
			list_refresh();
		}
	});
	
	btn_3 = new JButton("搜索");
	btn_3.setPreferredSize(new Dimension(100,30));
	panel_head.add(btn_3);
	btn_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			panel_1.setVisible(false);
			panel_2.setVisible(false);
			panel_3.setVisible(true);
		}
	});
	frame.setJMenuBar(panel_head);

// 下层面板1
	Font font = new Font("宋体", 1, 16);
	panel_1 = new JPanel();panel_1.setBounds(40, 30, 400, 250);
	panel_1.setLayout(new GridLayout(6, 2, 20, 15));
	
	pn = new JLabel("商品名：");
	pn.setFont(font);
	pn.setHorizontalAlignment(SwingConstants.CENTER);
	panel_1.add(pn);
	tn = new JTextField();
	tn.setFont(font);
	panel_1.add(tn);
	
	stock_amount = new JLabel("数量：");
	stock_amount.setFont(font);
	stock_amount.setHorizontalAlignment(SwingConstants.CENTER);
	panel_1.add(stock_amount);
	t_stock_amount = new JTextField();
	t_stock_amount.setFont(font);
	panel_1.add(t_stock_amount);
	
	label_mark = new JLabel("单位：");
	label_mark.setFont(font);
	label_mark.setHorizontalAlignment(SwingConstants.CENTER);
	panel_1.add(label_mark);
	text_mark = new JTextField();
	text_mark.setFont(font);
	panel_1.add(text_mark);
	
	price = new JLabel("价格：");
	price.setFont(font);
	price.setHorizontalAlignment(SwingConstants.CENTER);
	panel_1.add(price);
	t_price = new JTextField();
	t_price.setFont(font);
	panel_1.add(t_price);
	
	label_dscr = new JLabel("描述：");
	label_dscr.setFont(font);
	label_dscr.setHorizontalAlignment(SwingConstants.CENTER);
	panel_1.add(label_dscr);
	t_label_dscr = new JTextField();
	t_label_dscr.setFont(font);
	panel_1.add(t_label_dscr);
	
	btn_submit = new JButton("提交");
	btn_submit.setFont(font);
	btn_submit.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String cmd="{call add_commodity(?,?,?,?,?)}";
		PreparedStatement pstmt=sql.pre_exe(cmd);
		try {
			pstmt.setString(1, tn.getText());
			pstmt.setInt(2, Integer.parseInt(t_stock_amount.getText()));
			pstmt.setString(3, text_mark.getText());
			pstmt.setFloat(4,Float.parseFloat(t_price.getText()) );
			pstmt.setString(5, t_label_dscr.getText());
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			tn.setText(null);
			t_stock_amount.setText(null);
			text_mark.setText(null);
			t_price.setText(null);
			t_label_dscr.setText(null);
			if (!rs.wasNull()) {
				text_sta.setText(rs.toString());
			}
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	});
	panel_1.add(btn_submit);
	text_sta = new JTextField();
	panel_1.add(text_sta);
	panel_1.setVisible(true);
	frame.getContentPane().add(panel_1);
// 下层面板2
	panel_2 = new JPanel();
	panel_2.setBounds(40, 30, 400, 250);
	panel_2.setLayout(null);
	list_refresh();
	panel_2.setVisible(false);
	frame.getContentPane().add(panel_2);
// 下层面板3
	panel_3 = new JPanel();
	panel_3.setBounds(40, 30, 400, 250);
	panel_3.setLayout(new GridLayout(3, 2, 20, 15));
	
	l1 = new JLabel("商品名：");
	l1.setFont(font);
	l1.setHorizontalAlignment(SwingConstants.CENTER);
	panel_3.add(l1);
	t1 = new JTextField();
	t1.setFont(font);
	panel_3.add(t1);
	
	l2 = new JLabel("没想好：");
	l2.setFont(font);
	l2.setHorizontalAlignment(SwingConstants.CENTER);
	panel_3.add(l2);
	t2 = new JTextField();
	t2.setFont(font);
	panel_3.add(t2);
	
	btn = new JButton("提交");
	btn.setFont(font);
	btn.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String cmd=String.format("select * from stock where productname like '%%%s%%'",t1.getText());
		System.out.println(cmd);
		try {
			ResultSet rs = sql.exe(cmd);
			rs.next();
			t1.setText(null);
			t2.setText(null);
			if (!rs.wasNull()) {
				t3.setText(rs.getInt("ProductNumber")+rs.getString("ProductName")+rs.getInt("StockAmount")+rs.getString("Spec")+rs.getString("Unit")+rs.getFloat("price")+rs.getString("remark"));
			}
			rs.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
	});
	panel_3.add(btn);
	t3 = new JTextField();
	panel_3.add(t3);
	
	panel_3.setVisible(false);
	frame.getContentPane().add(panel_3);

	frame.setVisible(true);
}
public void list_refresh() {
	str=new String[500];
	panel_2.removeAll();
	list_dscr=new JLabel("库存清单:");
	list_dscr.setBounds(10, 10, 150, 40);
	panel_2.add(list_dscr);
	ResultSet rs=sql.exe("select * from see_stock");
	try {
		for(int i=0;rs.next();i++) {
			str[i]=rs.getString("productname")+Integer.toString(rs.getInt("stockamount"))+rs.getString("unit");
		}
		rs.close();	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	list=new JList<String>(str);
	list.setVisibleRowCount(200);
	sp=new JScrollPane(list);
	sp.setBounds(10, 60, 390, 180);
	panel_2.add(sp);
}
}
public class test {
    public static void main(String[] args)
    {
    	new Login(300,300);
    }
}