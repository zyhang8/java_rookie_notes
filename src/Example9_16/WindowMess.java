
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example9_16;
import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;
// �̳�JFrame,��ʵ��ActionListener
public class WindowMess extends JFrame implements ActionListener {
   JTextField inputEnglish;
   JTextArea show;
   String regex = "[a-zZ-Z]+"; 
   WindowMess() {
       inputEnglish=new JTextField(22);
       inputEnglish.addActionListener(this);
       show=new JTextArea(); 
       add(inputEnglish,BorderLayout.NORTH);//�������򵽴����ϲ�
       add(show,BorderLayout.CENTER); //�ı�����в�
       setVisible(true);//չʾ����
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent e) { 
       if(e.getSource()==inputEnglish) {
           String str=inputEnglish.getText();
           if(str.matches(regex)) {
              show.append(str+",");
           }
           else { //���������桱��Ϣ�Ի���
               JOptionPane.showMessageDialog(this,"�������˷Ƿ��ַ�","��Ϣ�Ի���",
                                             JOptionPane.WARNING_MESSAGE);
               inputEnglish.setText(null); 
           }  
      }
   }
}
