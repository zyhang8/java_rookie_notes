
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example4_24;
public class ComputerAver {
   public void giveAver(double [] b) {
      double sum=0;
      for(int i =0;i<b.length;i++) {  
         sum = sum+ b[i];
      }
      double aver=sum/b.length;
      System.out.println("ѡ�����÷�"+aver);
   }
}
