
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example6_2;
interface  ShowMessage {
   void ��ʾ�̱�(String s);
}
class TV implements ShowMessage {
   public void ��ʾ�̱�(String s) {
      System.out.println(s);
   }
}
class PC implements ShowMessage {
   public void ��ʾ�̱�(String s) { 
     System.out.println(s);
   }
}
public class Example6_2 {
   public static void main(String args[]) {
      ShowMessage sm;                  //�����ӿڱ���
      sm=new TV();                     //�ӿڱ����д�Ŷ��������
      sm.��ʾ�̱�("�����Ƶ��ӻ�");      //�ӿڻص���
      sm=new PC();                     //�ӿڱ����д�Ŷ��������
      sm.��ʾ�̱�("���뱼��5008PC��"); //�ӿڻص�
   } 
}
