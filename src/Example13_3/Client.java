
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example13_3;
import java.io.*;
import java.net.*;
public class Client {
   public static void main(String args[]) {
      String [] mess ={"2010���籭���ľ���?","�����������籭����?","�й��������籭����?"};
      Socket mysocket;
      DataInputStream in=null;
      DataOutputStream out=null;
      try{  mysocket=new Socket("127.0.0.1",2010);//���Ӷ˿�
            in=new DataInputStream(mysocket.getInputStream());//�������
            out=new DataOutputStream(mysocket.getOutputStream()); //������
            for(int i=0;i<mess.length;i++) {
              out.writeUTF(mess[i]);
              String  s=in.readUTF();   //in��ȡ��Ϣ������״̬
              System.out.println("�ͻ��յ��������Ļش�:"+s);
              Thread.sleep(500);
            } 
       }
       catch(Exception e) {
            System.out.println("�������ѶϿ�"+e);
       }
   } 
}
