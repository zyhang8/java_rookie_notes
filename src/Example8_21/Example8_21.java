
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

//package Example8_21;�ն˲����д˴���
//Console��ֻ���ڿ���̨��������ʹ�ã�
//������java IDE��ʹ�ã����׳� java.lang.NullPointerException )
import java.io.Console;
public class Example8_21 {
   public static void main(String args[]) {
	   //��ʼ��
      boolean success=false;
      int count=0;
      Console cons;
      char[] passwd;
      cons = System.console();//ʵ����console��
      while(true) {
         System.out.print("��������:");
         passwd=cons.readPassword(); //�ȴ��û���������
         count++;//�����������
         String password=new String(passwd); //�û���������ת��Ϊ�ַ���
         if (password.equals("I love this game")) {//�Ա�
            success=true;
             System.out.println("��"+count+"��������ȷ!");//�ɹ�
            break;
         }
         else {
             System.out.println("��"+count+"������"+password+"����ȷ");
         }
         if(count==3) {//����3���������
            System.out.println("��"+count+"����������붼����ȷ");
            System.exit(0); 
         } 
      }
      if(success) {
          System.out.println("��ã���ӭ��!");
      }
   }
}
