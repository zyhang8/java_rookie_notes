
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example12_5;
public class Example12_5 {
   public static void main(String args[]) {
      Home home=new Home();
      Thread showTime=new Thread(home); 
      showTime.start();
   }
}

