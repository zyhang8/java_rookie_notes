
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example13_4;
import java.io.*;
public class Read implements Runnable {
   DataInputStream in;
   public void setDataInputStream(DataInputStream in) {
      this.in = in;
   }
   public void run() {
      double result=0;
      while(true) {
        try{ result=in.readDouble();
             System.out.println("Բ�����:"+result);
             System.out.print("����԰�İ뾶(����������N):");
        }
        catch(IOException e) { 
             System.out.println("��������ѶϿ�"+e);
             break;
        }   
      }
   }
}