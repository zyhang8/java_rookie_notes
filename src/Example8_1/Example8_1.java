
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_1;
public class Example8_1 {
  public static void main(String args[]) {
       String hello = "你好";
       String testOne = "你"+"好";             //【代码1】
       System.out.println(hello == testOne);   //输出结果是true
       System.out.println("你好" == testOne);  //输出结果是true
       System.out.println("你好" == hello);    //输出结果是true
       String you = "你";
       String hi = "好";
       String testTwo = you+hi;                //【代码2】
       System.out.println(hello == testTwo);   //输出结果是false
       String testThree = you+hi;                       
       System.out.println(testTwo == testThree); //输出结果是false
    }
}
