
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example2_3;
import java.util.Scanner;
public class Example2_3 {
    public static void main (String args[ ]){
        System.out.println("请输入若干个数，每输入一个数回车确认");
        System.out.println("最后输入数字0结束输入操作");
        Scanner reader=new Scanner(System.in);
        double sum=0;
        double x = reader.nextDouble();
        while(x!=0){
           sum=sum+x;
           x=reader.nextDouble();
        }
        System.out.println("sum="+sum);
    }
}



