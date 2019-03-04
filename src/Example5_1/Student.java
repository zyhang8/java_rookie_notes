
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_1;
public class Student extends People {
   int number;
   void tellNumber() {
       System.out.printf("学号:%d\t",number); 
   }
   int add(int x,int y) {
      return x+y;
   } 
} 