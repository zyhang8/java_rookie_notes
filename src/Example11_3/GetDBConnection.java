
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example11_3;
import java.sql.*; 
public class GetDBConnection {
   public static Connection connectDB(String DBName,String id,String p) {
      Connection con = null;
      String uri = 
     "jdbc:mysql://localhost:3306/"+DBName+"?useSSL=true&characterEncoding=utf-8";
      try{  Class.forName("com.mysql.jdbc.Driver");//加载JDBC-MySQL驱动
      }
      catch(Exception e){}
      try{  
         con = DriverManager.getConnection(uri,id,p); //连接代码
      }
      catch(SQLException e){}
      return con;
   }
}
