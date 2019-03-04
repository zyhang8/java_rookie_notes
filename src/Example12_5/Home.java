
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_5;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Home implements Runnable {
   int time=0;
   SimpleDateFormat m=new SimpleDateFormat("hh:mm:ss");
   Date date;
   public void run() {     
      while(true) {
        date=new Date();
        System.out.println(m.format(date));
        time++;
        try{ Thread.sleep(1000);
        }
        catch(InterruptedException e){}
        if(time==3) {
          Thread thread=Thread.currentThread();
          thread=new Thread(this);
          thread.start();
        }
      }
   }
}

