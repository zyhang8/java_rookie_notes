package java_sql;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainWindow extends JFrame {
	// *********************************************
		// 第一步声明程序所需控件
		// *********************************************
		JFrame frame;
		// 上边面板的控件
		JButton btn_add, btn_2, btn_3;
		JPanel panel_head, panel_1, panel_2, panel_3;
		// 下面第二个面板的控件
		JLabel label_query_name;
		JTextField text_in;
		JTextArea text_result;
		JButton btn_Ok;
		// 下面第一个面板的控件
		JButton btn_submit;
		JLabel label_name, label_number, label_mark;
		JTextField text_name, text_number, text_mark, text_sta;
		// 下面第三个面板的控件
		JLabel label;
		JTextArea text_cnt;
	 
		public MainWindow() {
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
			frame.setBounds(screenWidth / 3, screenHeight / 4, 460, 310); // 设置位置及大小
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setBackground(Color.lightGray);
			frame.getContentPane().setLayout(null); // 使用绝对布局
			frame.setResizable(false); // 设置窗口大小不可变
	 
			// 上层面板
			panel_head = new JPanel();
			panel_head.setBounds(2, 0, 440, 40);
			panel_head.setBackground(Color.lightGray);
			panel_head.setVisible(true);
			panel_head.setLayout(new GridLayout(1, 3, 2, 0));
	 
			btn_add = new JButton("新增");
			btn_add.setFont(new Font("宋体", 1, 12)); // 设置字体 格式 大小
			btn_add.setVisible(true);
			panel_head.add(btn_add);
			btn_add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(true);
					panel_2.setVisible(false);
					panel_3.setVisible(false);
				}
			});
	 
			btn_2 = new JButton("查询学生");
			btn_2.setVisible(true);
			panel_head.add(btn_2);
			btn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(false);
					panel_2.setVisible(true);
					panel_3.setVisible(false);
				}
			});
	 
			btn_3 = new JButton("及格人数");
			btn_3.setVisible(true);
			panel_head.add(btn_3);
			btn_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(false);
					panel_2.setVisible(false);
					panel_3.setVisible(true);
					text_cnt.setText(operator.query_num());
				}
			});
	 
			frame.getContentPane().add(panel_head);
	 
			// 下层面板
	 
			Font font = new Font("宋体", 1, 16);
	 
			panel_1 = new JPanel();
			panel_1.setBounds(2, 45, 440, 225);
			panel_1.setBackground(Color.lightGray);
			panel_1.setLayout(new GridLayout(4, 2, 20, 20));
	 
			label_number = new JLabel("学号：");
			label_number.setFont(font);
			label_number.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(label_number);
	 
			text_number = new JTextField();
			text_number.setFont(font);
			panel_1.add(text_number);
	 
			label_name = new JLabel("姓名：");
			label_name.setFont(font);
			label_name.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(label_name);
	 
			text_name = new JTextField();
			text_name.setFont(font);
			panel_1.add(text_name);
	 
			label_mark = new JLabel("成绩：");
			label_mark.setFont(font);
			label_mark.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(label_mark);
	 
			text_mark = new JTextField();
			text_mark.setFont(font);
			panel_1.add(text_mark);
	 
			btn_submit = new JButton("提交");
			btn_submit.setFont(font);
			btn_submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = text_mark.getText();
					String sta = operator.adds(text_number.getText(),
							text_name.getText(), Double.parseDouble(s));
					if ("添加成功".equals(sta)) {
						text_number.setText(null);
						text_name.setText(null);
						text_mark.setText(null);
					}
					text_sta.setText(sta);
				}
			});
			panel_1.add(btn_submit);
	 
			text_sta = new JTextField();
			panel_1.add(text_sta);
	 
			panel_1.setVisible(true);
			frame.getContentPane().add(panel_1);
	 
			// 下层面板
			panel_2 = new JPanel();
			panel_2.setBounds(2, 45, 440, 225);
			panel_2.setBackground(Color.lightGray);
			panel_2.setLayout(null);
	 
			label_query_name = new JLabel("输入要查询的学生姓名：");
			label_query_name.setBounds(10, 10, 150, 40);
			panel_2.add(label_query_name);
	 
			text_in = new JTextField();
			text_in.setBounds(160, 10, 100, 40);
			panel_2.add(text_in);
	 
			text_result = new JTextArea();
			text_result.setBounds(10, 60, 420, 140);
			text_result.setFont(font);
			text_result.setEditable(false);
			panel_2.add(text_result);
	 
			btn_Ok = new JButton("查询");
			btn_Ok.setFont(font);
			btn_Ok.setBounds(300, 10, 100, 40);
			btn_Ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					text_result.setText(operator.query_stu(text_in.getText()));
				}
			});
			panel_2.add(btn_Ok);
	 
			panel_2.setVisible(false);
			frame.getContentPane().add(panel_2);
	 
			// 下层面板
			 panel_3 = new JPanel();
			 panel_3.setBounds(2, 45, 440, 225);
			 panel_3.setBackground(Color.lightGray);
			 panel_3.setLayout(null);
			 
			 label = new JLabel("库存：");
			 label.setBounds(10, 10, 150, 40);
			 label.setFont(font);
			 panel_3.add(label);
			 
			 String str[]=new String[1000];
			 JList list=new JList(str);
			 list.setVisibleRowCount(20);
			 panel_3.add(new JScrollPane(list));
            
//			 text_cnt = new JTextArea();
//			 text_cnt.setFont(new Font("宋体",1,30));
//			 text_cnt.setBounds(10, 60, 420, 140);
//			 panel_3.add(text_cnt);
			
			 frame.getContentPane().add(panel_3);
			 panel_3.setVisible(false);
	 
			// 需添加完组件后设置可见
			frame.setVisible(true); // 设置窗口可见
	 
		}
}
