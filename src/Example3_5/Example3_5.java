
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_5;
public class Example3_5 {
   public static void main(String args[]) {
      long sum=0,a=8,item=a,n=12,i=1;
      for(i=1;i<=n;i++) {
           sum=sum+item;
           item=item*10+a;  
      }
      System.out.println(sum);
   }
}





