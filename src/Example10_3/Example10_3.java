
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_3;
import java.io.*;
public class Example10_3 {
   public static void main(String args[]) {
      try{ 
           Runtime ce=Runtime.getRuntime();
           File file=new File("c:/windows","Notepad.exe");
           ce.exec(file.getAbsolutePath());
           file=new File("C:\\Program Files\\Internet Explorer","IEXPLORE www.sina.com ");
           ce.exec(file.getAbsolutePath());
      }
      catch(Exception e) {
         System.out.println(e);
      } 
   } 
}
