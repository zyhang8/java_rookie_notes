
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_16;
import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;
// 继承JFrame,并实现ActionListener
public class WindowMess extends JFrame implements ActionListener {
   JTextField inputEnglish;
   JTextArea show;
   String regex = "[a-zZ-Z]+"; 
   WindowMess() {
       inputEnglish=new JTextField(22);
       inputEnglish.addActionListener(this);
       show=new JTextArea(); 
       add(inputEnglish,BorderLayout.NORTH);//添加输入框到窗体上部
       add(show,BorderLayout.CENTER); //文本框放中部
       setVisible(true);//展示窗体
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) { 
       if(e.getSource()==inputEnglish) {
           String str=inputEnglish.getText();
           if(str.matches(regex)) {
              show.append(str+",");
           }
           else { //弹出“警告”消息对话框。
               JOptionPane.showMessageDialog(this,"您输入了非法字符","消息对话框",
                                             JOptionPane.WARNING_MESSAGE);
               inputEnglish.setText(null); 
           }  
      }
   }
}
