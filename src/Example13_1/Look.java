
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example13_1;
import java.net.*;
import java.io.*;
public class Look implements Runnable {
   URL url;
   public void setURL(URL url) {
      this.url=url;
   }
   public void run() {
      try { 
        InputStream in = url.openStream();//����������
        byte [] b = new byte[1024];//�ֽ�����
        int n=-1;//��¼��ȡ�ֽ���
        while((n=in.read(b))!=-1) {
           String str = new String(b,0,n);//����0��n���ֽ��ڵ�����ת��Ϊ�ַ���
           System.out.print(str);//���
        }
      }
      catch(IOException exp){}//��������,Ӧ����
   }
}