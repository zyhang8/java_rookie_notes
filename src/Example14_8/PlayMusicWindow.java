
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example14_8;
import java.awt.*;
import javax.swing.*;
public class PlayMusicWindow extends JFrame {
   MusicButton [] buttonSyllable; //����7�����ڵİ�ť���� 
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
