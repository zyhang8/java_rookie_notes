
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_19;
import java.io.*;
public class Example10_19 {
   public static void main(String args[]) {
      File file=new File("Example12_15.java");
      WindowFileLock win=new WindowFileLock(file);
      win.setTitle("使用文件锁");
   }
}
