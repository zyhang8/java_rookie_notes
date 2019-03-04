
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_5;
public class TV {
   double price ;
   public void setPrice(double m) {
      price = m;
   }
   public String toString() {
      String oldStr = super.toString(); 
      return oldStr+"\n这是电视机，价格是:"+price;
   }
}
