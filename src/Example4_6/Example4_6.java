
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_6;
class Computer{  
    int add(int x,int y){
       return x+y;
    }
}
public class Example4_6 {
    public static void main(String args[]){
       Computer com = new Computer();
       int m = 100;
       int n = 200;
       int result = com.add(m,n);
       System.out.println(result); 
    }
}


