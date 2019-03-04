
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example2_1;
public class  Example2_1 {
   public static void main (String args[ ]) {
      char chinaWord='好',japanWord='ぁ';
      char you='\u4F60';//unicode 16 编码 4f60 对应10进制的20320
      int  position=20320;
      System.out.println("汉字:"+chinaWord+" 的位置:"+(int)chinaWord);
      System.out.println("日文:"+japanWord+" 的位置:"+(int)japanWord);
      System.out.println(position+"位置上的字符是:"+(char)position);
      position=21319;
      System.out.println(position+"位置上的字符是:"+(char)position); 
      System.out.println("you:"+you);
   }
}

