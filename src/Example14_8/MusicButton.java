
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example14_8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.applet.*;
public class MusicButton extends JButton implements ActionListener {
      String musicName = "1.wav";
      MusicButton() {
        addActionListener(this);
      }
      public void actionPerformed(ActionEvent exp) {
          File file=new File(musicName);
          try { URI uri=file.toURI();
                URL url=uri.toURL();
                AudioClip clip=Applet.newAudioClip(url);
                clip.play();
          }
          catch(Exception ee){} 
      }
      public void setClipFile(String name){
         musicName = name;
         String t=musicName.substring(0,musicName.indexOf("."));
         setText(""+t); 
         int M = JComponent.WHEN_IN_FOCUSED_WINDOW;
         registerKeyboardAction(this,KeyStroke.getKeyStroke(t),M);
      }
}