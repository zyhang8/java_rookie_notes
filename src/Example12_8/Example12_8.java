
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example12_8;
public class Example12_8 {
   public static void main(String args[ ]) {
      TicketHouse officer = new TicketHouse();
      Thread zhangfei,likui;
      zhangfei = new Thread(officer); 
      zhangfei.setName("�ŷ�");
      likui = new Thread(officer);  
      likui.setName("����");
      zhangfei.start();
      likui.start();
   }
}
