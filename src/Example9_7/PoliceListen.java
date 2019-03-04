
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_7;
import java.awt.event.*;
import javax.swing.*;
public class PoliceListen implements MyCommandListener {
   JTextField textInput;
   JTextArea textShow;
   public void setJTextField(JTextField text) {
      textInput = text;
   }
   public void setJTextArea(JTextArea area) {
      textShow = area;
   } 
   public void actionPerformed(ActionEvent e) {
      String str=textInput.getText();
      textShow.append(str+"的长度:"+str.length()+"\n");

   }
}
