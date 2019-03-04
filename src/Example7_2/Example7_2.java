
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example7_2;
public class Example7_2 {
   public static void main(String args[]) {
       ShowBoard board=new ShowBoard();
       board.showMess(new OutputEnglish());  //向参数传递OutputAlphabet的子类对象
       board.showMess(new OutputAlphabet()  
                                                            //向参数传递OutputAlphabet的匿名子类对象
                       {  public void output() 
                          {  for(char c='α';c<='ω';c++)  //输出希腊字母
                               System.out.printf("%3c",c); 
                          }  
                       }
                     );
   } 
}


