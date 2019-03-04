
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_2;
import java.io.*;
public class Example10_2 {
   public static void main(String args[]) {
      File dirFile = new File(".");
      FileAccept fileAccept = new FileAccept();
      fileAccept.setExtendName("java");
      String fileName[] = dirFile.list(fileAccept);
      for(String name:fileName) {
          System.out.println(name);
      }
   }
}
