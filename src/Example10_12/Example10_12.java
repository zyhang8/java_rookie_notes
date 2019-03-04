
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_12;
import java.io.*;
public class Example10_12 {
   public static void main(String args[]) {
      String command = "渡江总攻时间是4月22日晚10点";
      EncryptAndDecrypt person = new EncryptAndDecrypt();
      String password = "Tiger";
      String secret = person.encrypt(command,password); 
      File file=new File("secret.txt");
      try{
          FileOutputStream fos=new FileOutputStream(file);
          DataOutputStream outData=new DataOutputStream(fos);
          outData.writeUTF(secret);
          System.out.println("加密命令:"+secret);
       } 
       catch(IOException e){}
       try{
          FileInputStream fis=new FileInputStream(file);
          DataInputStream inData=new DataInputStream(fis);
          String str = inData.readUTF();
          String mingwen = person.decrypt(str,password);
          System.out.println("解密命令:"+mingwen);       
       }
       catch(IOException e){}
   }
}
