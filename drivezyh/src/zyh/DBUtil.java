package zyh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBUtil {	
	private final static String DRIVER = "com.mysql.jdbc.Driver";     

	private final static String URL = "jdbc:mysql://localhost/drive?useUnicode=true&characterEncoding=gb2312";

	private final static String USER = "root"; 
	
	private final static String PASSWORD = "123456"; 
	
	
	public static Connection getConn(){
		Connection conn = null;
		try {
			
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	
	public static void closeConn(Connection conn){
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static int executeUpdate(String sql,Connection conn,Object... values ){
		
		int count = 0;
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);

			setParam(ps, values);
		
			count = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
	public static ResultSet executeQuery(String sql,Connection conn,Object... values){
		ResultSet rs = null;
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);

			setParam(ps, values);
			
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public static void setParam(PreparedStatement ps, Object... values) {
		try {
			if (values != null) {
				for (int i = 0; i < values.length; i++) {
					ps.setObject(i + 1, values[i]);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
