
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_7;
import javax.swing.*;
import java.awt.event.*;
interface MyCommandListener extends ActionListener {
     public void setJTextField(JTextField text);
     public void setJTextArea(JTextArea area); 
     
}