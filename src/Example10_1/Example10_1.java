
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_1;
import java.io.*;
public class Example10_1 {
   public static void main(String args[]) {
      File f = new File("C:\\ch10","Example10_1.java");
      System.out.println(f.getName()+"是可读的吗:"+f.canRead());
      System.out.println(f.getName()+"的长度:"+f.length());
      System.out.println(f.getName()+"的绝对路径:"+f.getAbsolutePath());
      File file = new File("new.txt");
      System.out.println("在当前目录下创建新文件"+file.getName());
      if(!file.exists()) {
         try {
              file.createNewFile();
              System.out.println("创建成功");
         }
         catch(IOException exp){}
      }
   }
}
