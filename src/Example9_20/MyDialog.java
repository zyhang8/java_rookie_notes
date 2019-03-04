
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_20;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyDialog extends JDialog implements ActionListener  { //对话框类
    JTextField inputTitle;
    String title;
    MyDialog(JFrame f,String s) { //构造方法	
       super(f,s);
       inputTitle=new JTextField(10); 
       inputTitle.addActionListener(this);
       setLayout(new FlowLayout());
       add(new JLabel("输入窗口的新标题")); 
       add(inputTitle);
       setBounds(60,60,100,100);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
       title=inputTitle.getText();
       setVisible(false);
    }  
    public String getTitle() {
       return title;
    }
}
