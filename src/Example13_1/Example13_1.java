
// java�α�����,��ѧϰʵ��;
// �ο��Կα���������.
// ��������������ϸע��˵��,�����������ϵ��.--ylin
// "�Ұ�ѧϰ,ѧϰҲ����."ר��ˮӡ.

package Example13_1;
import java.net.*;
import java.io.*;
import java.util.*;
public class Example13_1 {
   public static void main(String args[]) {
       Scanner scanner;
       URL url;
       Thread readURL;
       Look look = new Look();
       System.out.println("����URL��Դ,����:http://www.yahoo.com");
       scanner = new Scanner(System.in);
       String source = scanner.nextLine();//source�����url�ַ���
       try {  url = new URL(source);//��sourseʵ����url��,urlӦ��net�µ���
              look.setURL(url);//url����look���µ�url
              readURL = new Thread(look);//ʵ�����̶߳���
              readURL.start();//��ʼ�߳�
       }
       catch(Exception exp){
          System.out.println(exp);//�������,�������.ps:��������,��Ӧ�׳�.����ȷ���������ͺ���ദ��.
       } 
   }
}

