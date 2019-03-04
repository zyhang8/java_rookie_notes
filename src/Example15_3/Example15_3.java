
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_3;
import java.util.*;
public class Example15_3 {
    public static void main(String args[]){
        LinkedList mylist=new LinkedList();
        mylist.add("你");                 //链表中的第一个节点
        mylist.add("好");                 //链表中的第二个节点
        int number=mylist.size();         //获取链表的长度
        for(int i=0;i<number;i++){
          String temp=(String)mylist.get(i); //必须强制转换取出的数据
          System.out.println("第"+i+"节点中的数据:"+temp);
        } 
        Iterator iter=mylist.iterator();
        while(iter.hasNext()) {
          String te=(String)iter.next();  //必须强制转换取出的数据
          System.out.println(te);
        }
   }
}
