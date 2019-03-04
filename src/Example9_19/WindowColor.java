
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_19;
import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;
public class WindowColor extends JFrame implements ActionListener {
   JButton button;
   WindowColor() {
      button=new JButton("打开颜色对话框"); 
      button.addActionListener(this);
      setLayout(new FlowLayout());
      add(button);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) {
      Color newColor=JColorChooser.showDialog(this,"调色板",getContentPane().getBackground());
      if(newColor!=null) {
         getContentPane().setBackground(newColor); 
      }    
   }
}
