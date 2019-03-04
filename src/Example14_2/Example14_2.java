
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example14_2;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
class MyCanvs extends JPanel { 
   public void paint(Graphics g) {
      Graphics2D g_2d=(Graphics2D)g;
      String s="Hello";
      Ellipse2D ellipse= new Ellipse2D. Double (30,30,80,30);
      AffineTransform trans=new  AffineTransform(); 
      for(int i=1;i<=24;i++){
         trans.rotate(15.0*Math.PI/180,70,45);
         g_2d.setTransform(trans);
         g_2d.draw(ellipse);  //现在画的就是旋转后的椭圆
     }
     for(int i=1;i<=12;i++) {
        trans.rotate(30.0*Math.PI/180,60,160);
        g_2d.setTransform(trans);
        g_2d.drawString(s,60,160);//现在画的就是旋转后的字符串
     }
  }
}
public class Example14_2{
   public static void main(String args[]) {
      JFrame win = new JFrame();
      win.setSize(400,400);
      win.add(new MyCanvs());
      win.setVisible(true);    
   }     
}
