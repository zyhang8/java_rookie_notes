
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example13_4;
import java.io.*;
public class Read implements Runnable {
   DataInputStream in;
   public void setDataInputStream(DataInputStream in) {
      this.in = in;
   }
   public void run() {
      double result=0;
      while(true) {
        try{ result=in.readDouble();
             System.out.println("圆的面积:"+result);
             System.out.print("输入园的半径(放弃请输入N):");
        }
        catch(IOException e) { 
             System.out.println("与服务器已断开"+e);
             break;
        }   
      }
   }
}