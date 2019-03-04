
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_6;
public class Example8_6{
   public static void main(String args[]) {
      char [] a,c; 
      String s="1945年8月15日是抗战胜利日";
      a=new char[4];
      s.getChars(11,15,a,0);
      System.out.println(a);
      c="十一长假期间，学校都放假了".toCharArray();
      for(int i=0;i<c.length;i++)
        System.out.print(c[i]);
   }
}

