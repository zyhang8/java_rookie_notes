
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example12_9;
public class Example12_9 {
   public static void main(String args[]) {
     ThreadJoin  a = new ThreadJoin();
     Thread customer = new Thread(a);
     Thread cakeMaker = new Thread(a);
     customer.setName("�˿�");
     cakeMaker.setName("����ʦ");
     a.setJoinThread(cakeMaker);
     customer.start();
   }
}