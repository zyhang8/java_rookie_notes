
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example6_1;
public class China implements Computable {  //China类实现Computable接口
   int number;
   public int f(int x) { //不要忘记public关键字
      int sum=0;
      for(int i=1;i<=x;i++) {
         sum=sum+i;
      }
      return sum;
   }
}
