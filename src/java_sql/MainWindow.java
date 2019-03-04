package java_sql;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MainWindow extends JFrame {
	// *********************************************
		// ��һ��������������ؼ�
		// *********************************************
		JFrame frame;
		// �ϱ����Ŀؼ�
		JButton btn_add, btn_2, btn_3;
		JPanel panel_head, panel_1, panel_2, panel_3;
		// ����ڶ������Ŀؼ�
		JLabel label_query_name;
		JTextField text_in;
		JTextArea text_result;
		JButton btn_Ok;
		// �����һ�����Ŀؼ�
		JButton btn_submit;
		JLabel label_name, label_number, label_mark;
		JTextField text_name, text_number, text_mark, text_sta;
		// ������������Ŀؼ�
		JLabel label;
		JTextArea text_cnt;
	 
		public MainWindow() {
			// ********************************
			// �ڶ������� �ײ㴰������
			// ********************************
			// �õ���ǰ��Ļ�ĳߴ�
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int screenWidth = screenSize.width;
			int screenHeight = screenSize.height;
			// frameָ�ײ㴰��
			frame = new JFrame("stock");
			frame.setBounds(screenWidth / 3, screenHeight / 4, 460, 310); // ����λ�ü���С
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setBackground(Color.lightGray);
			frame.getContentPane().setLayout(null); // ʹ�þ��Բ���
			frame.setResizable(false); // ���ô��ڴ�С���ɱ�
	 
			// �ϲ����
			panel_head = new JPanel();
			panel_head.setBounds(2, 0, 440, 40);
			panel_head.setBackground(Color.lightGray);
			panel_head.setVisible(true);
			panel_head.setLayout(new GridLayout(1, 3, 2, 0));
	 
			btn_add = new JButton("����");
			btn_add.setFont(new Font("����", 1, 12)); // �������� ��ʽ ��С
			btn_add.setVisible(true);
			panel_head.add(btn_add);
			btn_add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(true);
					panel_2.setVisible(false);
					panel_3.setVisible(false);
				}
			});
	 
			btn_2 = new JButton("��ѯѧ��");
			btn_2.setVisible(true);
			panel_head.add(btn_2);
			btn_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_1.setVisible(false);
					panel_2.setVisible(true);
					panel_3.setVisible(false);
				}
			});
	 
			btn_3 = new JButton("��������");
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
	 
			// �²����
	 
			Font font = new Font("����", 1, 16);
	 
			panel_1 = new JPanel();
			panel_1.setBounds(2, 45, 440, 225);
			panel_1.setBackground(Color.lightGray);
			panel_1.setLayout(new GridLayout(4, 2, 20, 20));
	 
			label_number = new JLabel("ѧ�ţ�");
			label_number.setFont(font);
			label_number.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(label_number);
	 
			text_number = new JTextField();
			text_number.setFont(font);
			panel_1.add(text_number);
	 
			label_name = new JLabel("������");
			label_name.setFont(font);
			label_name.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(label_name);
	 
			text_name = new JTextField();
			text_name.setFont(font);
			panel_1.add(text_name);
	 
			label_mark = new JLabel("�ɼ���");
			label_mark.setFont(font);
			label_mark.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(label_mark);
	 
			text_mark = new JTextField();
			text_mark.setFont(font);
			panel_1.add(text_mark);
	 
			btn_submit = new JButton("�ύ");
			btn_submit.setFont(font);
			btn_submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = text_mark.getText();
					String sta = operator.adds(text_number.getText(),
							text_name.getText(), Double.parseDouble(s));
					if ("��ӳɹ�".equals(sta)) {
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
	 
			// �²����
			panel_2 = new JPanel();
			panel_2.setBounds(2, 45, 440, 225);
			panel_2.setBackground(Color.lightGray);
			panel_2.setLayout(null);
	 
			label_query_name = new JLabel("����Ҫ��ѯ��ѧ��������");
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
	 
			btn_Ok = new JButton("��ѯ");
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
	 
			// �²����
			 panel_3 = new JPanel();
			 panel_3.setBounds(2, 45, 440, 225);
			 panel_3.setBackground(Color.lightGray);
			 panel_3.setLayout(null);
			 
			 label = new JLabel("��棺");
			 label.setBounds(10, 10, 150, 40);
			 label.setFont(font);
			 panel_3.add(label);
			 
			 String str[]=new String[1000];
			 JList list=new JList(str);
			 list.setVisibleRowCount(20);
			 panel_3.add(new JScrollPane(list));
            
//			 text_cnt = new JTextArea();
//			 text_cnt.setFont(new Font("����",1,30));
//			 text_cnt.setBounds(10, 60, 420, 140);
//			 panel_3.add(text_cnt);
			
			 frame.getContentPane().add(panel_3);
			 panel_3.setVisible(false);
	 
			// ���������������ÿɼ�
			frame.setVisible(true); // ���ô��ڿɼ�
	 
		}
}
