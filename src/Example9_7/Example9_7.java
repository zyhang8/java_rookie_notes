
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example9_7;
public class Example9_7 {
   public static void main(String args[]) {
      WindowActionEvent win=new WindowActionEvent();
      PoliceListen police = new PoliceListen(); //����������
      win.setMyCommandListener(police); //������ϼ�����
      win.setBounds(100,100,460,360);
      win.setTitle("����ActionEvent�¼�");
   }
}

