
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example10_2;
import java.io.*;
public class FileAccept implements FilenameFilter {
 private String extendName;
   public void setExtendName(String s) {
      extendName="."+s;
   }
   public boolean accept(File dir,String name) { //重写接口中的方法
      return name.endsWith(extendName);
   }
}
