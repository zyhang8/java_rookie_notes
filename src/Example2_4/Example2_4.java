
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example2_4;
public class Example2_4 {
   public static void main(String args[]) {
      int a[]={1,2,3,4};
      int b[]={100,200,300};
      System.out.println("数组a的元素个数="+a.length);
      System.out.println("数组b的元素个数="+b.length);
      System.out.println("数组a的引用="+a);
      System.out.println("数组b的引用="+b);
      a=b;
      System.out.println("数组a的元素个数="+a.length);
      System.out.println("数组b的元素个数="+b.length);
      System.out.println("a[0]="+a[0]+",a[1]="+a[1]+",a[2]="+a[2]);
      System.out.print("b[0]="+b[0]+",b[1]="+b[1]+",b[2]="+b[2]);
   }
} 




