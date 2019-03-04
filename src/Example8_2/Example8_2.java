
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_2;
public class Example8_2 {
  public static void main(String args[]) {
       String s1,s2;
       s1 = new String("天道酬勤");
       s2 = new String("天道酬勤");
       System.out.println(s1.equals(s2));   	//输出结果是：true
       System.out.println(s1==s2);          	//输出结果是：false
       String s3,s4; 
       s3 = "we are students";
       s4 = new String("we are students");
       System.out.println(s3.equals(s4));   	//输出结果是：true
       System.out.println(s3==s4);         	//输出结果是：false 
       String s5,s6;
       s5 = "勇者无敌";
       s6 = "勇者无敌"; 
       System.out.println(s5.equals(s6));   	//输出结果是：true
       System.out.println(s5==s6);         	//输出结果是：true
    }
}
