
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_8;
import java.awt.event.*;
import javax.swing.*;
public class ComputerListener implements ActionListener {
   JTextField inputNumberOne,inputNumberTwo; 
   JTextArea textShow;
   String fuhao;
   public void setJTextFieldOne(JTextField t) {
       inputNumberOne = t;
   }
   public void setJTextFieldTwo(JTextField t) {
       inputNumberTwo = t;
   }
   public void setJTextArea(JTextArea area) {
       textShow = area;
   }
   public void setFuhao(String s) {
       fuhao = s;
   }
   public void actionPerformed(ActionEvent e) {
      try {
            double number1=Double.parseDouble(inputNumberOne.getText());
            double number2=Double.parseDouble(inputNumberTwo.getText());
            double result = 0;
            if(fuhao.equals("+")) {
                result = number1+number2;
            }
            else if(fuhao.equals("-")) {
                result = number1-number2;
            }
            else if(fuhao.equals("*")) {
                result = number1*number2;
            }
            else if(fuhao.equals("/")) {
                result = number1/number2;
            }
            textShow.append(number1+" "+fuhao+" "+number2+" = "+result+"\n");
      }
      catch(Exception exp) {
             textShow.append("\n请输入数字字符\n");
      }         
   }
}
