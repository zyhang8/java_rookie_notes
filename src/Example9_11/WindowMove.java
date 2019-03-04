
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_11;
import java.awt.*;
import javax.swing.*;
public class WindowMove extends JFrame { 
     LP layeredPane;
     WindowMove() {
      layeredPane = new LP();
      add(layeredPane,BorderLayout.CENTER);
      setVisible(true);
      setBounds(12,12,300,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}


