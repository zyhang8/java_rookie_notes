
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_7;
class Sum { 
    int n;
    float f() { 
       float sum=0;
       for(int i=1;i<=n;i++)
          sum=sum+i;
       return sum;  
    }
}
class Average extends Sum {
    int n;  
    float f() { 
      float c;
      super.n=n;
      c=super.f();
      return c/n; 
    }
   float g() {
       float c;
       c=super.f();
       return c/2; 
   }
}
public class Example5_7 {
   public static void main(String args[]) {
       Average aver=new Average();
       aver.n=100;
      
       float resultTwo=aver.g(); float resultOne=aver.f();
       System.out.println("resultOne="+resultOne);
       System.out.println("resultTwo="+resultTwo);
   }
}
