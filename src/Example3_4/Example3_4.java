
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_4;
import java.util.Scanner;
public class Example3_4{
   public static void main(String args[]) {
        int number;
	System.out.println("输入正整数(回车确定)");
        Scanner reader=new Scanner(System.in);
	number = reader.nextInt();
	switch(number) {
	    case 9 :
	    case 131 :
	    case 12 :  System.out.println(number+"是三等奖");
		       break;
	    case 209 :
	    case 596 :
	    case 27 :  System.out.println(number+"是二等奖");
		           break;
	    case 875 :
	    case 316 :
	    case 59 :   System.out.println(number+"是一等奖");
	       	        break;
	    default:    System.out.println(number+"未中奖");
        }
   }
}





