
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example11_3;
import java.sql.*; 
public class Example11_3 {
   public static void main(String args[]) {
      Connection con;
      Statement sql; 
      ResultSet rs;
      con = GetDBConnection.connectDB("students","root","");
      if(con == null ) return;
      String c1=" year(birthday)<=2000 and month(birthday)>7";//条件1
      String c2=" name Like '张_%'";
      String c3=" height >1.65";
      String sqlStr =
      "select * from mess where "+c1+" and "+c2+" and "+c3+"order by birthday";
      try { 
          sql=con.createStatement();
          rs = sql.executeQuery(sqlStr);
          while(rs.next()) { 
             String number=rs.getString(1);
             String name=rs.getString(2);
             Date date=rs.getDate(3);
             float height=rs.getFloat(4);
             System.out.printf("%s\t",number);
             System.out.printf("%s\t",name);
             System.out.printf("%s\t",date); 
             System.out.printf("%.2f\n",height);
          }
          con.close();
      }
      catch(SQLException e) { 
         System.out.println(e);
      }
  }
}
