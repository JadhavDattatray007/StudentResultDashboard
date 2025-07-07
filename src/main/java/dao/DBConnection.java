package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
		private static final String URL = "jdbc:mysql://localhost:3306/student_attendance_student";
	    private static final String USER = "root";        
	    private static final String PASS = "root"; 
	    
	    public static Connection getConnection() {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection(URL, USER, PASS);
	            System.out.println("✅ DB connected: " + conn);
	            System.out.println(conn.toString());
	        } catch (ClassNotFoundException e) {
	            System.out.println("❌ JDBC Driver not found.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("❌ SQL Exception - Check DB URL/User/Pass");
	            e.printStackTrace();
	        }
	        return conn;
	    }



}
