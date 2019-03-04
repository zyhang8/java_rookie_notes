
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_9;
public class Example4_9 {
   public static void main(String args[]) {
       SIM simOne = new SIM(13889776509L);
       MobileTelephone mobile = new MobileTelephone();
       mobile.setSIM(simOne);
       System.out.println("手机号码:"+mobile.lookNumber()); 
       SIM simTwo = new SIM(15967563567L);
       mobile.setSIM(simTwo);
       System.out.println("手机号码:"+mobile.lookNumber());  
    }
}