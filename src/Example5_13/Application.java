
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_13;
public class Application {
   public static void main(String args[]) {
      MobileTelephone telephone = new MobileTelephone ();
      SIM sim=new SIMOfChinaMobile();
      sim.setNumber("13887656432");
      telephone.useSIM(sim);
      telephone.showMess();
      sim=new SIMOfChinaUnicom();
      sim.setNumber("13097656437");
      telephone.useSIM(sim);
      telephone.showMess();
   }
}
