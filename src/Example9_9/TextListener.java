
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_9;
import java.awt.event.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;
public class TextListener implements DocumentListener {
   JTextArea inputText,showText;
   public void setInputText(JTextArea text) {
      inputText = text;
   }
   public void setShowText(JTextArea text) {
      showText = text;
   } 
   public void changedUpdate(DocumentEvent e) {
      String str=inputText.getText(); 
     //空格、数字和符号(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式:
      String regex="[\\s\\d\\p{Punct}]+"; 
      String words[]=str.split(regex); 
      Arrays.sort(words);      //按字典序从小到大排序
      showText.setText(null); 
      for(int i=0;i<words.length;i++)
         showText.append(words[i]+",");
   }
   public void removeUpdate(DocumentEvent e) { 
      changedUpdate(e);
   }
   public void insertUpdate(DocumentEvent e) { 
      changedUpdate(e);
   }
}
