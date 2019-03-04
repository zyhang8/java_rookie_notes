
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_6;
public class AdvertisementBoard { //负责创建广告牌
   public void show(Advertisement adver) {
       System.out.println(adver.getCorpName()+"的广告词如下:");
       adver.showAdvertisement(); //接口回调
   }
}
