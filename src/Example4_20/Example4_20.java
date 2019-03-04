
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_20;
public class Example4_20 { 
   public static void main(String args[ ]) { 
      char a[]={'a','b','c','D','E','F'};
      for(int i=0;i<a.length;i++) { 
         if(Character.isLowerCase(a[i]))    
             a[i]=Character.toUpperCase(a[i]);
         else if(Character.isUpperCase(a[i]))
             a[i]=Character.toLowerCase(a[i]);
       }
      for(int i=0;i<a.length;i++)   
         System.out.print(" "+a[i]);
 
   } 
}




