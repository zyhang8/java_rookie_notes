
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example5_13;
public class Application {
   public static void main(String args[]) {
      MobileTelephone telephone = new MobileTelephone ();
      SIM sim=new SIMOfChinaMobile();
      sim.setNumber("13887656432");
      telephone.useSIM(sim);
      telephone.showMess();
      sim=new SIMOfChinaUnicom();
      sim.setNumber("13097656437");
      telephone.useSIM(sim);
      telephone.showMess();
   }
}
