
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_7;
import java.awt.*;
import javax.swing.*;
public class WindowActionEvent extends JFrame { 
   JTextField inputText;
   JTextArea textShow;
   JButton button;
   MyCommandListener listener;
   public WindowActionEvent() {
      init();
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   void init() {
      setLayout(new FlowLayout());
      inputText = new JTextField(10); 
      button = new JButton("确定");
      textShow = new JTextArea(9,30);
      add(inputText);
      add(button);
      add(new JScrollPane(textShow));
   }
   void setMyCommandListener(MyCommandListener listener) {
      this.listener = listener;
      listener.setJTextField(inputText);
      listener.setJTextArea(textShow);
      inputText.addActionListener(listener);  //inputText是事件源,listener是监视器
      button.addActionListener(listener);     //button是事件源,listener是监视器
   }
}
