
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example11_2;
import java.util.*;
public class GetRandomNumber {
   public static int [] getRandomNumber(int max,int amount) {
      //1-max之间的amount个不同随机整数
     int [] randomNumber = new int[amount];
     int index =0;
     randomNumber[0]= -1;
     Random random = new Random();
     while(index<amount){
       int number = random.nextInt(max)+1;
       boolean isInArrays=false;
       for(int m:randomNumber){//m依次取数组randomNumber元素的值（见3.7）
          if(m == number)
            isInArrays=true;  //number在数组里了
       }
       if(isInArrays==false){
           //如果number不在数组randomNumber中:
           randomNumber[index] = number;
           index++;   
       }
     }
     return  randomNumber;
   }
}