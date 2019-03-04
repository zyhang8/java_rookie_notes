
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_21;
class Student{
   int number;
}
public class Example4_21 { 
   public static void main(String args[ ]) { 
      Student stu[] = new Student[10];  //创建对象数组
      for(int i=0;i<stu.length;i++) { 
        stu[i]=new Student();     //创建Student对象
        stu[i].number = 101+i;
      }
      for(int i=0;i<stu.length;i++) { 
         System.out.println(stu[i].number);
      }
   } 
}




