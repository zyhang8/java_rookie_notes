
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example9_6;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
// �̳���JFrame(������)
public class WindowActionEvent extends JFrame { 
   JTextField text;
   ActionListener listener;             //ʵ����������
   public WindowActionEvent() {
      setLayout(new FlowLayout());
      text = new JTextField(10); 
      add(text);//������.���෽��
      listener = new ReaderListen();       //����������ַ������ȵļ�����
      text.addActionListener(listener);   //text���¼�Դ,listener�Ǽ�����,��
      // չʾ.���෽��
      setVisible(true);
      // ����Ĭ���˳�.��
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
