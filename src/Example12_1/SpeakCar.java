
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example12_1;
public class SpeakCar extends Thread {
   public void run() {
      for(int i=1;i<=20;i++) {
         System.out.print("�γ�"+i+"  ");
      }  
   } 
}
