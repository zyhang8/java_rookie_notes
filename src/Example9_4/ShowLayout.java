
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example9_4;
import java.awt.*;
import javax.swing.*;
public class ShowLayout extends JFrame {
    PanelGridLayout pannelGrid; //网格布局的面板
    PanelNullLayout panelNull ; //空布局的面板
    JTabbedPane p;              //选项卡窗格
    ShowLayout() {
       pannelGrid = new PanelGridLayout();
       panelNull  = new PanelNullLayout();
       p = new JTabbedPane();
       p.add("网格布局的面板",pannelGrid);
       p.add("空布局的面板",panelNull);
       add(p,BorderLayout.CENTER);
       add(new JButton("窗体是BorderLayout布局"),BorderLayout.NORTH);
       add(new JButton("南"),BorderLayout.SOUTH);
       add(new JButton("西"),BorderLayout.WEST);
       add(new JButton("东"),BorderLayout.EAST);
       setBounds(10,10,570,390);
       setVisible(true);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       validate();
   }
   
}

