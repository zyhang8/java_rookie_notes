
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_4;
interface CompurerAverage {
   public double average(double a,double b);
}
class A implements CompurerAverage {
   public double average(double a,double b) {
      double aver=0;
      aver=(a+b)/2;
      return aver;
   }
}
class B implements CompurerAverage {
   public double average(double a,double b) {
      double aver=0;
      aver=Math.sqrt(a*b);
      return aver;
   }
}
public class Example6_4 {
   public static void main(String args[]) {
      CompurerAverage computer;
      double a=11.23,b=22.78;
      computer = new A();  
      double result = computer.average(a,b);
      System.out.printf("%5.2f和%5.2f的算术平均值:%5.2f\n",a,b,result);
      computer = new B();  
      result= computer.average(a,b);
      System.out.printf("%5.2f和%5.2f的几何平均值:%5.2f",a,b,result);
   } 
}
