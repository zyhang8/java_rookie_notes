
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_6;
import java.io.*;
public class Example10_6 {
   public static void main(String args[]) {
      File sourceFile = new File("a.txt");  //读取的文件
      File targetFile = new File("b.txt");  //写入的文件
      char c[] =new char[19];               //char型数组 
      try{  
         Writer out = new FileWriter(targetFile,true); //指向目的地的输出流
         Reader in  = new FileReader(sourceFile);   //指向源的输入流  
         int n = -1;
         while((n=in.read(c))!=-1) {
             out.write(c,0,n);
         }
         out.flush();
         out.close();
      }
      catch(IOException e) {
          System.out.println("Error "+e);
      }
  }
}
