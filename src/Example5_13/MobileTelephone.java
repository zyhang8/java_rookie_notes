
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_13;
public class MobileTelephone {
   SIM card;
   public void useSIM(SIM card) {
      this.card=card;
   }
   public void showMess() {
      System.out.println("使用的卡是:"+card.giveCorpName()+"提供的");
      System.out.println("手机号码是:"+card.giveNumber());
   }
}
