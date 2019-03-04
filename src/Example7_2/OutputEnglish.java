
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_2;
public class OutputEnglish extends OutputAlphabet {
   public void output() {
      for(char c='a';c<='z';c++) {
         System.out.printf("%3c",c);
      }  
   } 
}
