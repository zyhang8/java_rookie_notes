
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_24;
public class ComputerAver {
   public void giveAver(double [] b) {
      double sum=0;
      for(int i =0;i<b.length;i++) {  
         sum = sum+ b[i];
      }
      double aver=sum/b.length;
      System.out.println("选手最后得分"+aver);
   }
}
