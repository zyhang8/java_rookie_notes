
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example2_2;
public class Example2_2 { 
   public static void main (String args[]) {
      byte b = 22; 
      int  n = 129;  
      float f =123456.6789f ;
      double d=123456789.123456789;
      System.out.println("b=  "+b);   
      System.out.println("n=  "+n);
      System.out.println("f=  "+f);   
      System.out.println("d=  "+d); 
      b=(byte)n;    //导致精度的损失.
      f=(float)d;   //导致精度的损失
      System.out.println("b=  "+b);   
      System.out.println("f=  "+f); 
   }
}


