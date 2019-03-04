
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_4;
import java.util.*;
class Student implements Comparable { 
   int height=0;
   String name;
   Student(String n,int h) {
      name=n;
      height = h;
     
   }
   public int compareTo(Object b) { // 两个Student对象相等当且仅当二者的height值相等
     Student st=(Student)b;
     return (this.height-st.height);
   }
}
public class Example15_4 {
    public static void main(String args[ ]) { 
       List<Student> list = new LinkedList<Student>();
       list.add(new Student("张三",188));
       list.add(new Student("李四",178));
       list.add(new Student("周五",198)); 
       Iterator<Student> iter=list.iterator();//构造迭代器
       System.out.println("排序前,链表中的数据");
       while(iter.hasNext()){//迭代
          Student stu=iter.next();
          System.out.println(stu.name+ "身高:"+stu.height);
       }
       Collections.sort(list);
       System.out.println("排序后,链表中的数据");
       iter=list.iterator();
       while(iter.hasNext()){
          Student stu=iter.next();
          System.out.println(stu.name+ "身高:"+stu.height);
       }
       Student zhaoLin = new Student("zhao xiao lin",178);
       int index = Collections.binarySearch(list,zhaoLin,null);//二分查找和zhaolin相等的对象的下标.
       if(index>=0) {
            System.out.println(zhaoLin.name+"和链表中"+list.get(index).name+"身高相同");
       }
    }
}

