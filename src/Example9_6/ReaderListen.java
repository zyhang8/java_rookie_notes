
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example9_6;
import java.awt.event.*;
// ��ȡ������,ʱʵ���¼������ӿ�.���������addActionListener�������������󶨵������.
public class ReaderListen implements ActionListener { 
   public void actionPerformed(ActionEvent e) {
      String str=e.getActionCommand();   //��ȡ��װ���¼��еġ�����ַ���
      //ActionEvent�෽��:.getSource()(return object)��ȡԴ��������.
      //string getActionCommand()��ȡ���¼���ص�һ��"����"�ַ���,�ı��������Ĭ��Ϊ�ı������ַ���.
      //�¼�Դ��setCommand(String)������
      System.out.println(str+":"+str.length());
   }
}
