
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

//package Example8_21;终端不可有此代码
//Console类只能在控制台命令行中使用，
//不能在java IDE中使用（会抛出 java.lang.NullPointerException )
import java.io.Console;
public class Example8_21 {
   public static void main(String args[]) {
	   //初始化
      boolean success=false;
      int count=0;
      Console cons;
      char[] passwd;
      cons = System.console();//实例化console类
      while(true) {
         System.out.print("输入密码:");
         passwd=cons.readPassword(); //等待用户输入密码
         count++;//输入计数增加
         String password=new String(passwd); //用户输入密码转化为字符串
         if (password.equals("I love this game")) {//对比
            success=true;
             System.out.println("第"+count+"次密码正确!");//成功
            break;
         }
         else {
             System.out.println("第"+count+"次密码"+password+"不正确");
         }
         if(count==3) {//连续3次输入错误
            System.out.println("您"+count+"次输入的密码都不正确");
            System.exit(0); 
         } 
      }
      if(success) {
          System.out.println("你好，欢迎你!");
      }
   }
}
