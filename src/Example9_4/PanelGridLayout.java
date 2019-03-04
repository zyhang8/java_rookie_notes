
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_4;
import java.awt.*;
import javax.swing.*;
public class PanelGridLayout extends JPanel {
    PanelGridLayout () {
       GridLayout grid=new GridLayout(12,12);  //网格布局
       setLayout(grid);
       Label label[][]=new Label[12][12];
       for(int i=0;i<12;i++) {
         for(int j=0;j<12;j++) {
            label[i][j]=new Label();
            if((i+j)%2==0)
               label[i][j].setBackground(Color.black);
            else
               label[i][j].setBackground(Color.white);
            add(label[i][j]); 
         }
       }
    }
}
      
