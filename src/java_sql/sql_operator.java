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
			// ���������ʹ��rs.getString();ǰһ��Ҫ����rs.next();
 
			// ԭ��ResultSet�������SQL���ִ�еĽ������ά��ָ���䵱ǰ�����еĹ�ꡣ
			// ÿ����һ��next()��������������ƶ�һ�С������λ�ڵ�һ��֮ǰ����˵�һ�ε���next()
			// Ӧ�ѹ�����ڵ�һ���ϣ�ʹ����Ϊ��ǰ�С�����ÿ�ε���next()�����¹�������ƶ�һ�С�
			// ��ResultSe������t����Statement����ر�֮ǰ�����һֱ������Ч��
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
					return "��ӳɹ�";
				} else {
					 con.close();
					return "���ʧ��";
				}
			}else{
				con.close();
				if(9 == number.length()) return "�ɼ����Ϸ�������ʧ��";
				else return "ѧ�Ų��Ϸ�������ʧ��";
			}
		} catch (SQLException e) {
			return e.toString();
		}
	}
}
