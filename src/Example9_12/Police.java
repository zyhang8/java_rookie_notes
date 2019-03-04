
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_12;
import java.awt.event.*;
import javax.swing.*;
public class Police implements KeyListener,FocusListener  {
    public void keyPressed(KeyEvent e) {
      JTextField t=(JTextField)e.getSource();
      if(t.getCaretPosition()>=6)
         t.transferFocus(); 
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void focusGained(FocusEvent e) {
      JTextField text=(JTextField)e.getSource();
      text.setText(null); 
    }
    public void focusLost(FocusEvent e){}
}
