
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_9;
public class ThreadJoin implements Runnable {
   Cake cake;
   Thread joinThread;
   public void setJoinThread(Thread t) {
      joinThread=t;
   }
   public void run() {
      if(Thread.currentThread().getName().equals("顾客")) {
          System.out.println(Thread.currentThread().getName()+"等待"+
                             joinThread.getName()+"制作生日蛋糕");
          try{  joinThread.start();
                joinThread.join();             //当前线程开始等待joinThread结束
          } 
          catch(InterruptedException e){}
          System.out.println(Thread.currentThread().getName()+
                         "买了"+cake.name+" 价钱:"+cake.price);
      }
      else if(Thread.currentThread()==joinThread) {
          System.out.println(joinThread.getName()+"开始制作生日蛋糕,请等...");
          try { Thread.sleep(2000);    
          }
          catch(InterruptedException e){}
          cake=new Cake("生日蛋糕",158) ;
          System.out.println(joinThread.getName()+"制作完毕");
      }
   }   
   class Cake {  //内部类
     int price;
     String name;
     Cake(String name,int price) {
       this.name=name;
       this.price=price;
     } 
   }
}
