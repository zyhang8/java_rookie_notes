
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_18;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class WindowEnter extends JFrame implements ActionListener {
   JTextField inputName; 
   JTextArea  save;
   WindowEnter() {
      inputName=new JTextField(22);
      inputName.addActionListener(this);
      save=new JTextArea();
      add(inputName,BorderLayout.NORTH); 
      add(new JScrollPane(save),BorderLayout.CENTER); 
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) {
      String s=inputName.getText();
      int n=JOptionPane.showConfirmDialog(this,"确认是否正确","确认对话框",
                                      JOptionPane.YES_NO_OPTION );
      if(n==JOptionPane.YES_OPTION) {  
         save.append("\n"+s);
      }  
      else if(n==JOptionPane.NO_OPTION) { 
         inputName.setText(null);
      }
   }
}
