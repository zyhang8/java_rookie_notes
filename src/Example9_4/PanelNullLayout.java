
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_4;
import javax.swing.*;
public class PanelNullLayout extends JPanel {
   JButton button;
   JTextField text;
   PanelNullLayout() {
      setLayout(null);  //空布局
      button = new JButton("确定");
      text = new JTextField();
      add(text);
      add(button);
      text.setBounds(100,30,90,30);
      button.setBounds(190,30,66,30);
   }

}