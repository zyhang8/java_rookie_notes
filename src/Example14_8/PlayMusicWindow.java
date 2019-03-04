
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example14_8;
import java.awt.*;
import javax.swing.*;
public class PlayMusicWindow extends JFrame {
   MusicButton [] buttonSyllable; //代表7个音节的按钮数组 
   PlayMusicWindow() {
      buttonSyllable = new MusicButton[8];
      setLayout(new GridLayout(1,7));
      for(int i=1;i<=7;i++){
        buttonSyllable[i] = new MusicButton();
        buttonSyllable[i].setClipFile(i+".wav");
        add(buttonSyllable[i]);
      } 
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setSize(350,120);
   }
   public static void main(String args[]) {
      new PlayMusicWindow().setVisible(true);
   }
}
