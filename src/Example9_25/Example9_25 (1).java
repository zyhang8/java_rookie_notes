/*
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_25;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Person extends JButton implements FocusListener { 
   int number;
   Color c=new Color(255,245,170);
   Font font=new Font("宋体",Font.BOLD,12);
   Person(int number,String s) {
       super(s);
       setBackground(c);
       setFont(font);
       this.number=number;
       c=getBackground();
       addFocusListener(this);
   }
   public void focusGained(FocusEvent e) {
      setBackground(Color.red);
   }
   public void focusLost(FocusEvent e) {
      setBackground(c);
   }
}
*/