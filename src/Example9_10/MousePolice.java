
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_10;
import java.awt.event.*;
import javax.swing.*;
public class MousePolice implements MouseListener {
   JTextArea area;
   public void setJTextArea(JTextArea area) {
      this.area=area;
   }
   public void mousePressed(MouseEvent e) {
      area.append("\n鼠标按下,位置:"+"("+e.getX()+","+e.getY()+")");
   }
   public void mouseReleased(MouseEvent e) {
      area.append("\n鼠标释放,位置:"+"("+e.getX()+","+e.getY()+")");
   }
   public void mouseEntered(MouseEvent e)  {
      if(e.getSource() instanceof JButton)
        area.append("\n鼠标进入按纽,位置:"+"("+e.getX()+","+e.getY()+")");
      if(e.getSource() instanceof JTextField)
        area.append("\n鼠标进入文本框,位置:"+"("+e.getX()+","+e.getY()+")");
      if(e.getSource() instanceof JFrame)
        area.append("\n鼠标进入窗口,位置:"+"("+e.getX()+","+e.getY()+")"); 
   }
   public void mouseExited(MouseEvent e) {
      area.append("\n鼠标退出,位置:"+"("+e.getX()+","+e.getY()+")");
   }
   public void mouseClicked(MouseEvent e) {
      if(e.getClickCount()>=2)
         area.setText("鼠标连击，位置:"+"("+e.getX()+","+e.getY()+")");
   }
}
