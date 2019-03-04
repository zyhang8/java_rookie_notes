
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_7;
public class Example8_7 {
    public static void main(String args[]) {
       byte d[]="Java你好".getBytes(); 
       System.out.println("数组d的长度是:"+d.length);
       String s=new String(d,6,2); //输出：好
       System.out.println(s);
       s=new String(d,0,6);
       System.out.println(s);   //输出：Java你
    }
}


