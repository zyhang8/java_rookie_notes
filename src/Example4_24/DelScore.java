
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_24;
public class DelScore {
   ComputerAver computer ;
   DelScore(ComputerAver computer) {
       this.computer = computer;
   }
   public void doDelete(double [] a) {
      java.util.Arrays.sort(a);  //数组a从小到大排序（见例子11）
      System.out.print("去掉一个最高分:"+a[a.length-1]+"，");
      System.out.print("去掉一个最低分:"+a[0]+"。");  
      double b[] =new double[a.length-2];
      for(int i=1;i<a.length-1;i++) { //去掉最高分和最低分
        b[i-1] = a[i];
      }
      computer.giveAver(b);
   }
}
