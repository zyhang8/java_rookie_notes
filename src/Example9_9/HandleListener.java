
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_9;
import java.awt.event.*;
import javax.swing.*;
public class HandleListener implements ActionListener {
   JTextArea inputText,showText;
   public void setInputText(JTextArea text) {
      inputText = text;
   }
   public void setShowText(JTextArea text) {
      showText = text;
   } 
   public void actionPerformed(ActionEvent e) {
      String str=e.getActionCommand(); 
      if(str.equals("copy"))
         showText.copy();
      else if(str.equals("cut"))
         showText.cut();
      else if(str.equals("paste"))
         inputText.paste();
   }
}
