//package dao;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//import models.Student;
//
//public class StudentDAO {
//	
//	   public static List<Student> getAllStudents() {
//	        List<Student> students = new ArrayList<>();
//
//        String query = "SELECT * FROM student";
//		
//		try (Connection conn = DBConnection.getConnection();
//	             Statement stmt = conn.createStatement();
//	             ResultSet rs = stmt.executeQuery(query)) {
//			System.out.println("Connection object: " + conn); // debug log
//			
//			
//			while (rs.next()) {
//                Student s = new Student(
//                    rs.getInt("id"),
//                    rs.getString("name"),
//                    rs.getString("roll_no"),
//                    rs.getString("subject"),
//                    rs.getInt("marks"),
//                    rs.getString("grade")
//                );
//						
//				 students.add(s);
//			}
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//		
//		return students;
//		
//	}
//
//}
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import models.Student;

public class StudentDAO {
    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();

            // Make sure this matches the actual schema and table name
            String sql = "SELECT * FROM student_attendance_student.student";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setRollNo(rs.getString("roll_no"));
                s.setSubject(rs.getString("subject"));
                s.setMarks(rs.getInt("marks"));
                s.setGrade(rs.getString("grade"));

                students.add(s);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }
    
    
    
    
    
    
    public static boolean addStudent(String name, String rollNo, String subject, int marks, String grade) {
        boolean success = false;

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO student (name, roll_no, subject, marks, grade) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, rollNo);
            pstmt.setString(3, subject);
            pstmt.setInt(4, marks);
            pstmt.setString(5, grade);

            int rows = pstmt.executeUpdate();
            success = rows > 0;

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
