
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example4_10;
public class Lader { 
    double 上底,高;       //实例变量
    static double 下底;     //类变量
    void 设置上底(double a) {
        上底 = a; 
    }
    void 设置下底(double b) {
        下底 = b; 
    }
    double 获取上底() {
       return 上底;
    }
    double 获取下底() {
       return 下底;
    }
}
