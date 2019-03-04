
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_20;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyWindow extends JFrame implements ActionListener {
   JButton button; 
   MyDialog dialog;
   MyWindow() {
      init();
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   void init() {
      button=new JButton("打开对话框"); 
      button.addActionListener(this);
      add(button,BorderLayout.NORTH); 
      dialog=new MyDialog(this,"我是对话框");  //对话框依赖于MyWindow创建的窗口
      dialog.setModal(true);   //有模式对话框  
   }
   public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true); 
        String str = dialog.getTitle();
        setTitle(str);
   }
}
