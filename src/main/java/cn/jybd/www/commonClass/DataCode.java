package cn.jybd.www.commonClass;

import java.sql.*;

public class DataCode {
	static Connection conn;
	static Statement statement;
//	建立数据库连接
	private static Connection getConn() {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://rdsd00p625x8727k1vf0o.mysql.rds.aliyuncs.com:3306/hb_20180821";
    String username = "jybd_user";
    String password = "pwd_jybd";
    Connection conn = null;
    try {
        Class.forName(driver); //classLoader,加载对应驱动
        conn = (Connection) DriverManager.getConnection(url,username, password);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return conn;
}

//	数据库插入
	public static int insert(String sql) {
	    Connection conn = getConn();
	    int i = 0;
//	    String sql = "insert into students (Name,Sex,Age) values(?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	       
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	
//	数据库更新
	public static void update(String sql) {
	    Connection conn = getConn();
	   
//	    String sql = "update students set Age='" + student.getAge() + "' where Name='" + student.getName() + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.executeUpdate();
        System.out.println("IP更新结果: " +"更新成功");
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    
	}
	
	
//	数据库查询
	public static String getAll(String sql) {
	    Connection conn = getConn();

	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	        int col = rs.getMetaData().getColumnCount();
	        System.out.println("============================");

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	public static String query(String sql,String queryContent) {
		Connection	conn = getConn(); // 同样先要获取连接，即连接到数据库
		
		 String queryContentTemp = "";
		try {
			statement = (Statement) conn.createStatement(); // 创建用于执行静态sql语句的Statement对象，st属局部变量
			ResultSet rs = statement.executeQuery(sql); // 执行sql查询语句，返回查询数据的结果集
			
			while (rs.next()) { // 判断是否还有下一个数据
				// 根据字段名获取相应的值
				queryContentTemp = rs.getString(queryContent);
			}
			rs.close();
			statement.close();
			conn.close(); // 关闭数据库连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return queryContentTemp;	
	}
	
//	数据库删除
	public static int delete(String sql) {
	    Connection conn = getConn();
	    int i = 0;
//	    String sql = "delete from students where Name='" + name + "'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        i = pstmt.executeUpdate();
	        System.out.println("resutl: " + i);
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
}