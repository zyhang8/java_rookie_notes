
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_13;
public class Example4_13 {
  public static void main(String args[]) {
      Circle circle = new Circle();
      circle.setRadius(196.87);
      Tixing lader = new Tixing(3,21,9);
      Student zhang = new Student();
      System.out.println("zhang计算圆的面积：");
      double result=zhang.computerArea(circle);
      System.out.println(result);
      System.out.println("zhang计算梯形的面积：");
      result=zhang.computerArea(lader);
      System.out.println(result);
   }
}


