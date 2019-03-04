
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_13;
public class Daemon implements Runnable {
   Thread A,B;
   Daemon() {
       A=new Thread(this);
       B=new Thread(this);
   }
   public void run() {
      if(Thread.currentThread()==A) {
          for(int i=0;i<8;i++) {
             System.out.println("i="+i) ;
             try{  Thread.sleep(1000);    
             }
             catch(InterruptedException e) {}
          } 
      }
      else if(Thread.currentThread()==B) {
          while(true) {
             System.out.println("线程B是守护线程 "); 
             try{  Thread.sleep(1000);    
             }
             catch(InterruptedException e){}
          }
      }
   }    
}
