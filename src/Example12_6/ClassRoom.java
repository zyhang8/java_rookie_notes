
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example12_6;
public class ClassRoom implements Runnable {
   Thread  student,teacher;
   ClassRoom() {
       teacher=new Thread(this); 
       student=new Thread(this); 
       teacher.setName("王教授");
       student.setName("张三");
   } 
   public void run(){     
      if(Thread.currentThread()==student) {
         try{  System.out.println(student.getName()+"正在睡觉，不听课");
               Thread.sleep(1000*60*60);
         }
         catch(InterruptedException e) {
              System.out.println(student.getName()+"被老师叫醒了");
         }
         System.out.println(student.getName()+"开始听课");
       }
      else if(Thread.currentThread()==teacher)  {
         for(int i=1;i<=3;i++) {
            System.out.println("上课!");
            try{ Thread.sleep(500);
            }
            catch(InterruptedException e){} 
         }
         student.interrupt();           //吵醒student
      }
   }
}
