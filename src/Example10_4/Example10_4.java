
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_4;
import java.io.*;
public class Example10_4 {
   public static void main(String args[]) {
      int n=-1;
      byte [] a=new byte[100];
      try{  File f=new File("Example10_4.java");
            InputStream in = new FileInputStream(f);
            while((n=in.read(a,0,100))!=-1) {
               String s=new String (a,0,n);
               System.out.print(s);
            }
            in.close();
      }
      catch(IOException e) {
           System.out.println("File read Error"+e);
      }
   }
}


