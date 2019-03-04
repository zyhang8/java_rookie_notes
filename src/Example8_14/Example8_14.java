
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_14;
public class Example8_14 {
   public static void main(String args[]) {
      StringBuffer str=new StringBuffer();
      str.append("大家好");
      System.out.println("str:"+str);
      System.out.println("length:"+str.length());
      System.out.println("capacity:"+str.capacity()); 
      str.setCharAt(0 ,'w'); 
      str.setCharAt(1 ,'e');
      System.out.println(str); 
      str.insert(2, " are all");
      System.out.println(str);
      int index=str.indexOf("好");
      str.replace(index,str.length()," right");
      System.out.println(str);
   }
}


