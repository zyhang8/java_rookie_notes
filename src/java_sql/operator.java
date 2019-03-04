package java_sql;
public class operator {
	public static String adds(String number, String name, double mark) {
		sql_operator ops = new sql_operator();
		String datasorce = "javalecture";
		String tableName = "javareport";
		ops.setDatasourceName(datasorce);
		ops.setTableName(tableName);
		ops.setNumber(number);
		ops.setName(name);
		ops.setMark(mark);
		return ops.addRecord();
	}
 
	public static String query_stu(String name) {
		sql_operator ops = new sql_operator();
		String datasorce = "javalecture";
		String tableName = "javareport";
		ops.setDatasourceName(datasorce);
		ops.setTableName(tableName);
		ops.setName(name);
		return ops.query_stu();
	}
	public static String query_num() {
		sql_operator ops = new sql_operator();
		String datasorce = "javalecture";
		String tableName = "javareport";
		ops.setDatasourceName(datasorce);
		ops.setTableName(tableName);
		return ops.query_cnt();
	}
}
 
