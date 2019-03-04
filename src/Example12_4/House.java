
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_4;
public class House implements Runnable {
   int waterAmount;       //用int变量模拟水量
   Thread dog,cat;        //线程是目标对象的成员
   House() {
      dog=new Thread(this);  //当前House对象作为线程的目标对象 
      cat=new Thread(this); 
   }
   public void setWater(int w) {
      waterAmount = w;
   }
   public void run() {     
      while(true) {
         Thread t=Thread.currentThread();
         if(t==dog) { 
              System.out.println("家狗喝水") ; 
              waterAmount=waterAmount-2;  //狗喝的多
         }
         else if(t==cat){
              System.out.println("家猫喝水") ;   
              waterAmount=waterAmount-1;  //猫喝的少
         }
         System.out.println(" 剩 "+waterAmount);
         try{  Thread.sleep(2000);  //间隔时间
         }
         catch(InterruptedException e){}  
         if(waterAmount<=0) {
                 return;    
         }  
     }
   }
}
