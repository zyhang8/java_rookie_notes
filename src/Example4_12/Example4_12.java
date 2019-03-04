
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_12;
class People {
   float hello(int a,int b) {
      return a+b;
   }
   float hello(long a,int b) {
      return a-b;
   }
   double hello(double a,int b) {
      return a*b;
   }
}
public class Example4_12 {
    public static void main(String args[]) {
      People tom = new People();
      System.out.println(tom.hello(10,20));
      System.out.println(tom.hello(10L,20));
      System.out.println(tom.hello(10.0,20));
   }
}
