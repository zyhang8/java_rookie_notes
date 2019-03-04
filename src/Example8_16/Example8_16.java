
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_16;
public class Example8_16 {
   public static void main(String args[]) {
      CalendarBean cb=new CalendarBean();
      cb.setYear(2022);
      cb.setMonth(6);
      String [] a= cb.getCalendar();//返回号码的一维数组
      char [] str="日一二三四五六".toCharArray();
      for(char c:str) {     
         System.out.printf("%3c",c);
      }
      for(int i=0;i<a.length;i++) {     //输出数组a
         if(i%7==0)
             System.out.println("");  //换行
         System.out.printf("%4s",a[i]);
      } 
   } 
}
