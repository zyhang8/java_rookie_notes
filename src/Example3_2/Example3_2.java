
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_2;
public class Example3_2 {
   public static void main(String args[]) {
      int a=9,b=5,c=7,t=0;
      if(b<a) {
        t=a; 
        a=b;
        b=t;
      }
      if(c<a) {
        t=a; 
        a=c;
        c=t;
      }
      if(c<b) {
        t=b; 
        b=c;
        c=t;
      }
      System.out.println("a="+a+",b="+b+",c="+c);
   }
}



