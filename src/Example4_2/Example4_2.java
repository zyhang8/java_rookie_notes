
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_2;
class Point {
    int x,y;
    Point(int a,int b) {
    x=a;
       y=b;
    }
}
public class Example4_2 {
   public static void main(String args[]) {
      Point p1,p2;                 //声明对象p1和p2
      p1=new Point(10,10);         //为对象分配变量(使用new和类中的构造方法)
      p2=new Point(23,35);        //为对象分配变量(使用new和类中的构造方法)
   }
}

