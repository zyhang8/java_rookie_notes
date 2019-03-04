
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example3_7;
public class Example3_7 {
   public static void main(String args[]) {
       int sum=0,i,j;
       for( i=1;i<=10;i++) {
          if(i%2==0) {            //计算1+3+5+7+9
             continue;
          }     
          sum=sum+i;
       }
       System.out.println("sum="+sum);
       for(j=2;j<=50;j++) {    //求50以内的素数
          for( i=2;i<=j/2;i++) {
             if(j%i==0) 
                break;
          }
          if(i>j/2) {  
             System.out.println(""+j+"是素数");
          }
       }      
   }
}

