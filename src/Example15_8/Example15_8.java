
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_8;
import java.util.*;
class Student implements Comparable {
   int english=0;
   String name;
   Student(int english,String name) {
      this.name=name;
      this.english=english;
   }
   public int compareTo(Object b) {
      Student st=(Student)b;
      return (this.english-st.english);
   }
}
public class Example15_8 {
  public static void main(String args[]) {
     TreeSet<Student> mytree=new TreeSet<Student>();
     Student st1,st2,st3,st4;
     st1=new Student(90,"赵一");
     st2=new Student(66,"钱二");
     st3=new Student(86,"孙三");
     st4=new Student(76,"李四");
     mytree.add(st1);
     mytree.add(st2);
     mytree.add(st3);
     mytree.add(st4);
     mytree.add(new Student(76,"王五"));//不允许重复
     Iterator<Student> te=mytree.iterator();
     while(te.hasNext()) {
        Student stu=te.next();
        System.out.println(""+stu.name+" "+stu.english);
     }
  }
}
