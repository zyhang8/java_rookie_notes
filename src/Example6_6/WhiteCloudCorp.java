
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_6;
public class WhiteCloudCorp implements Advertisement { //PhilipsCorp实现Avertisement接口
   public void showAdvertisement(){
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
      System.out.printf("飞机中的战斗机，哎yes!\n");
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
   }
   public String getCorpName() {
      return "白云有限公司" ; 
   }
}
