
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_9;
class A {
  final double PI=3.1415926;// PI是常量
  public double getArea(final double r) {
     return PI*r*r;
  }
  public final void speak() {
     System.out.println("您好，How's everything here ?");
  } 
}
public class Example5_9 {
   public static void main(String args[]) {
      A a=new A();
      System.out.println("面积："+a.getArea(100));
      a.speak();     
   }
}
