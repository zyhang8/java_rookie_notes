
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example2_1;
public class  Example2_1 {
   public static void main (String args[ ]) {
      char chinaWord='��',japanWord='��';
      char you='\u4F60';//unicode 16 ���� 4f60 ��Ӧ10���Ƶ�20320
      int  position=20320;
      System.out.println("����:"+chinaWord+" ��λ��:"+(int)chinaWord);
      System.out.println("����:"+japanWord+" ��λ��:"+(int)japanWord);
      System.out.println(position+"λ���ϵ��ַ���:"+(char)position);
      position=21319;
      System.out.println(position+"λ���ϵ��ַ���:"+(char)position); 
      System.out.println("you:"+you);
   }
}

