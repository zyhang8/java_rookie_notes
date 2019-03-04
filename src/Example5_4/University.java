
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example5_4;
public class University {
    void enterRule(double math,double english,double chinese) {
        double total=math+english+chinese;
        if(total>=180) 
           System.out.println("考分"+total+"达到大学最低录取线");
        else
           System.out.println("考分"+total+"未达到大学最低录取线");
    }
}
