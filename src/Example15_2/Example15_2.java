
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_2;
import java.util.*;
public class Example15_2 {
   public static void main(String args[]){
      List<String> list=new LinkedList<String>();
      for(int i=0;i<=60096;i++){
             list.add("speed"+i);
      }
      Iterator<String> iter=list.iterator();
      long starttime=System.currentTimeMillis();
      while(iter.hasNext()){
           String te=iter.next();
      }
      long endTime=System.currentTimeMillis();
      long result=endTime-starttime;
      System.out.println("使用迭代器遍历集合所用时间:"+result+"毫秒");
      starttime=System.currentTimeMillis();
      for(int i=0;i<list.size();i++){
          String te=list.get(i);
      }
      endTime=System.currentTimeMillis();
      result=endTime-starttime;
      System.out.println("使用get方法遍历集合所用时间:"+result+"毫秒");
    }
}
