
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example8_5;
public class TV {
   double price ;
   public void setPrice(double m) {
      price = m;
   }
   public String toString() {
      String oldStr = super.toString(); 
      return oldStr+"\n���ǵ��ӻ����۸���:"+price;
   }
}
