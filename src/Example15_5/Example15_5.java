
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_5;
import java.util.*;
public class Example15_5 {
    public static void main(String args[ ]) { 
       List<Integer> list = new LinkedList<Integer>();
       for(int i=10;i<=50;i=i+10)
           list.add(new Integer(i));
       System.out.println("洗牌前,链表中的数据");
       Iterator<Integer> iter=list.iterator();
       while(iter.hasNext()){
          Integer n=iter.next();
          System.out.printf("%d\t",n.intValue());
       }
       Collections.shuffle(list);
       System.out.printf("\n洗牌后,链表中的数据\n");
       iter=list.iterator();
       while(iter.hasNext()){
          Integer n=iter.next();
          System.out.printf("%d\t",n.intValue());
       }
       System.out.printf("\n再向右旋转1次后,链表中的数据\n");
       Collections.rotate(list,1);
       iter=list.iterator();
       while(iter.hasNext()){
          Integer n=iter.next();
          System.out.printf("%d\t",n.intValue());
       }
      
    }
}

