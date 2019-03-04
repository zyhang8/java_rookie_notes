
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_13;
public class Example8_13 {
   public static void main(String args[]) {
      String cost = "市话76.8元,长途:167.38元,短信12.68元";
      double priceSum = GetPrice.givePriceSum(cost);
      System.out.printf("%s\n总价:%.2f圆\n",cost,priceSum);
      cost = "牛奶:8.5圆,香蕉3.6圆，酱油:2.8圆";
      priceSum = GetPrice.givePriceSum(cost);
      System.out.printf("%s\n总价:%.2f圆\n",cost,priceSum);
   }
}
