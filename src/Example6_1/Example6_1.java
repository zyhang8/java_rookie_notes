
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_1;
public class Example6_1 {
   public static void main(String args[]) {
      China zhang; 
      Japan henlu;
      zhang=new China();   
      henlu=new Japan();  
      zhang.number=32+Computable.MAX; 
      henlu.number=14+Computable.MAX;
      System.out.println("zhang的学号"+zhang.number+",zhang求和结果"+zhang.f(100));
      System.out.println("henlu的学号"+henlu.number+",henlu求和结果"+henlu.f(100));
   }
}
