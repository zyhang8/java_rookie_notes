
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_12;
import java.awt.*;
import javax.swing.*;
public class Win extends JFrame {
   JTextField text[]=new JTextField[3];
   Police police; 
   JButton b;
   Win() {
      setLayout(new FlowLayout());
      police = new Police();
      for(int i=0;i<3;i++) {
         text[i]=new JTextField(7);
         text[i].addKeyListener(police);  //监视键盘事件
         text[i].addFocusListener(police);
         add(text[i]);
      }
      b=new JButton("确定");
      add(b);
      text[0].requestFocusInWindow();
      setVisible(true); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

