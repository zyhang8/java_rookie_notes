
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.
/*
package Example9_10;
import java.awt.*;
import javax.swing.*;
public class WindowMouse extends JFrame {
   JTextField text; 
   JButton button;
   JTextArea textArea;
   MousePolice police; 
   WindowMouse() {
      init();
      setBounds(100,100,420,220);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
   void init() {
      setLayout(new FlowLayout());
      text=new JTextField(8);
      textArea=new JTextArea(5,28);
      police=new MousePolice();
      police.setJTextArea(textArea); 
      text.addMouseListener(police);
      button=new JButton("按钮"); 
      button.addMouseListener(police);
      addMouseListener(police);
      add(button);
      add(text);
      add(new JScrollPane(textArea));
   }
}
*/