
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_24;
public class Line {
    InputScore one;
    DelScore two;
    ComputerAver three;  
    Line(){
       three=new ComputerAver();
       two=new DelScore(three);
       one=new InputScore(two);
    }
    public void givePersonScore(){ 
       one.inputScore();
    }
}
