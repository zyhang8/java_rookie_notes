
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example8_4;
public class Example8_4 {
   public static void main(String args[]) {
      double sum=0,item=0;
      boolean computable=true; 
      for(String s:args) {
         try{ item=Double.parseDouble(s);
              sum=sum+item;
         }
         catch(NumberFormatException e) {
              System.out.println("�������˷������ַ�:"+e);
              computable=false;
         }
      }
      if(computable)
         System.out.println("sum="+sum); 
  }
}
