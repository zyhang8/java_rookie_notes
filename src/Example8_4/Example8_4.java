
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_4;
public class Example8_4 {
   public static void main(String args[]) {
      double sum=0,item=0;
      boolean computable=true; 
      for(String s:args) {
         try{ item=Double.parseDouble(s);
              sum=sum+item;
         }
         catch(NumberFormatException e) {
              System.out.println("您键入了非数字字符:"+e);
              computable=false;
         }
      }
      if(computable)
         System.out.println("sum="+sum); 
  }
}
