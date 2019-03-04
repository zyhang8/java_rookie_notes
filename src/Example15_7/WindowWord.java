
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_7;
import java.awt.*;
import javax.swing.*;
public class WindowWord extends JFrame {
   JTextField inputText,showText;
   WordPolice police;           //监视器
   WindowWord() {
      setLayout(new FlowLayout());
      inputText=new JTextField(6);
      showText=new JTextField(6);
      add(inputText); 
      add(showText);
      police=new WordPolice();
      police.setJTextField(showText);
      inputText.addActionListener(police);
      setBounds(100,100,400,280);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
