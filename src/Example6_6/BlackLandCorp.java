
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_6;
public class BlackLandCorp implements Advertisement { 
   public void showAdvertisement(){
      System.out.println("**************");
      System.out.printf("劳动是爹\n土地是妈\n");
      System.out.println("**************");
   }
   public String getCorpName() {
      return "黑土集团" ; 
   }
}
