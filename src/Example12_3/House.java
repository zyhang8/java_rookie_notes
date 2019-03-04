
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_3;
public class House implements Runnable {
   int waterAmount;       //用int变量模拟水量
   public void setWater(int w) {
      waterAmount = w;
   }
   public void run() {     
      while(true) {
         String name=Thread.currentThread().getName();
         if(name.equals("狗")) { 
              System.out.println(name+"喝水") ; 
              waterAmount=waterAmount-2;  //狗喝的多
         }
         else if(name.equals("猫")){
              System.out.println(name+"喝水") ;   
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
