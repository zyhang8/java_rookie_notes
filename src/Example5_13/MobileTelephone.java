
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example5_13;
public class MobileTelephone {
   SIM card;
   public void useSIM(SIM card) {
      this.card=card;
   }
   public void showMess() {
      System.out.println("ʹ�õĿ���:"+card.giveCorpName()+"�ṩ��");
      System.out.println("�ֻ�������:"+card.giveNumber());
   }
}
