
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_7;
public class Example4_7 {
   public static void main(String args[]) {
      Battery nanfu = new Battery(100);
      System.out.println("南孚电池的储电量是:"+nanfu.electricityAmount);
      Radio radio = new Radio();
      System.out.println("收音机开始使用南孚电池");
      radio.openRadio(nanfu);
      System.out.println("目前南孚电池的储电量是:"+nanfu.electricityAmount);
   }
}
