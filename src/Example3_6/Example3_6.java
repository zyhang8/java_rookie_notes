
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_6;
public class Example3_6 {
   public static void main(String args[]) {
      double sum=0,item=1;
      int i=1,n=20;
      while(i<=n) { 
          sum=sum+item;
          i=i+1; 
          item=item*(1.0/i);         
      }
      System.out.println("sum="+sum);
   }
}




