package java_sql;
import java.util.*;
import java.sql.*;
 
public class sql_operator {
 
	String datasourceName = "";
	String tableName = "";
 
	String number = "", name = "";
	double mark;
 
	ArrayList<StringBuffer> queryResult;
 
	public sql_operator() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
 
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
 
	public void setDatasourceName(String s) {
		datasourceName = s.trim();
	}
 
	public void setTableName(String s) {
		tableName = s.trim();
	}
 
	public void setNumber(String s) {
		number = s.trim();
	}
 
	public void setName(String s) {
		name = s.trim();
	}
 
	public void setMark(double m) {
		mark = m;
	}
 
	public String query_stu() {
		String queryResult = "";
		Connection con;
		PreparedStatement sql;
		ResultSet rs;
		try {
			String uri = "jdbc:sqlserver://localhost:1433;DatabaseName=student_information";
			String id = "sa";
			String password = "ylin";
			con = DriverManager.getConnection(uri, id, password);
			
			String insertCondition = "SELECT * FROM " + tableName
					+ " WHERE name=?";
			sql = con.prepareStatement(insertCondition);
			sql.setString(1, name);
			rs = sql.executeQuery();
			while (rs.next()) {
				queryResult = rs.getString(1) + " "+rs.getString(2)+" "
						+ rs.getString(3);
			}
			con.close();
		} catch (SQLException e) {
			return e.toString();
		}
		return queryResult;
	}
	
	public String query_cnt() {
		int cnt = 0;
		Connection con;
		PreparedStatement sql;
		ResultSet rs;
		try {
			String uri = "jdbc:mysql://localhost:3306/" + datasourceName
					+ "?characterEncoding=utf8&useSSL=true";
			String id = "root";
			String password = "";
			con = DriverManager.getConnection(uri, id, password);
			
			String insertCondition = "SELECT COUNT(DISTINCT number) FROM "
					+ tableName + " WHERE mark>=60";
			sql = con.prepareStatement(insertCondition);
			rs = sql.executeQuery();
			// java.sql.SQLException: Before start of result set
			// 解决方法：使用rs.getString();前一定要加上rs.next();
 
			// 原因：ResultSet对象代表SQL语句执行的结果集，维护指向其当前数据行的光标。
			// 每调用一次next()方法，光标向下移动一行。最初它位于第一行之前，因此第一次调用next()
			// 应把光标置于第一行上，使它成为当前行。随着每次调用next()将导致光标向下移动一行。
			// 在ResultSe对象及其t父辈Statement对象关闭之前，光标一直保持有效。
			while (rs.next()) {
				cnt = rs.getInt(1);
			}
			con.close();
		} catch (SQLException e) {
			return e.toString();
		}
		return String.valueOf(cnt);
	}
 
	public String addRecord() {
		Connection con;
		PreparedStatement sql;
		try {
			String uri = "jdbc:mysql://localhost:3306/" + datasourceName
					+ "?characterEncoding=utf8&useSSL=true";
			String id = "root";
			String password = "";
			con = DriverManager.getConnection(uri, id, password);
			
			String insertCondition = "INSERT INTO " + tableName
					+ " VALUES (?,?,?)";
			sql = con.prepareStatement(insertCondition);
 
			if (9 == number.length()&&mark>=0&&mark<=100) {
				sql.setString(1, number);
				sql.setString(2, name);
				sql.setDouble(3, mark);
				int m = sql.executeUpdate();
				if (m != 0) {
					 con.close();
					return "添加成功";
				} else {
					 con.close();
					return "添加失败";
				}
			}else{
				con.close();
				if(9 == number.length()) return "成绩不合法，插入失败";
				else return "学号不合法，插入失败";
			}
		} catch (SQLException e) {
			return e.toString();
		}
	}
}
