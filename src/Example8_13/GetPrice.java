
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example8_13;
import java.util.*;
public class GetPrice {
   public static double givePriceSum(String cost) {
	  //ɨ����,�������������
      Scanner scanner = new Scanner(cost);
      //������'0123456789.'�ַ�,̰��ƥ������һ���ַ�.
      scanner.useDelimiter("[^0123456789.]+"); //scanner���÷ָ����
      double sum=0;//����
      while(scanner.hasNext()){//����ƥ�����ָ����������
         try{  double price = scanner.nextDouble();//�����������Ϊ������
               sum = sum+price;
         } 
         catch(InputMismatchException exp){//�쳣����
               String t = scanner.next();//�����������зǸ���������
         }   
      }
      return sum;
   }
}
