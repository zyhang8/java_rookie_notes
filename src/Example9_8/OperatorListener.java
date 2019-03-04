
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_8;
import java.awt.event.*;
import javax.swing.*;
public class OperatorListener implements ItemListener {
   JComboBox choice;
   ComputerListener workTogether;
   public void setJComboBox(JComboBox box) {
      choice = box;
   }
   public void setWorkTogether(ComputerListener computer) {
      workTogether = computer;
   }
   public void itemStateChanged(ItemEvent e)  {
      String fuhao = choice.getSelectedItem().toString();
      workTogether.setFuhao(fuhao);
   }
}
