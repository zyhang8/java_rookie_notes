
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example11_6;
import javax.swing.*;
public class Example11_6 {
   public static void main(String args[]) {
      String [] tableHead;
      String [][] content; 
      JTable table ;
      JFrame win= new JFrame();
      Query findRecord = new  Query();
      findRecord.setDatabaseName("students");
      findRecord.setSQL("select * from mess");
      content = findRecord.getRecord();
      tableHead=findRecord.getColumnName();
      table = new JTable(content,tableHead); 
      win.add(new JScrollPane(table));
      win.setBounds(12,100,400,200);
      win.setVisible(true); 
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
