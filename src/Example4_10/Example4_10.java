
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_10;
public class Example4_10 { 
   public static void main(String args[]) {
       Lader.下底=100;     //Lader的字节码被加载到内存,通过类名操作类变量
       Lader laderOne=new Lader();
       Lader laderTwo=new Lader();
       laderOne.设置上底(28);
       laderTwo.设置上底(66);
       System.out.println("laderOne的上底:"+laderOne.获取上底());
       System.out.println("laderOne的下底:"+laderOne.获取下底());
       System.out.println("laderTwo的上底:"+laderTwo.获取上底());
       System.out.println("laderTwo的下底:"+laderTwo.获取下底());
    } 
}
