<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, models.Student" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Result Dashboard</title>
</head>
<p>JSP loaded ✅</p>
<body>
    <h2>All Students</h2>
  
    <a href="add_student.jsp">➕ Add New Student</a><br><br>
  
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Roll No</th>
            <th>Subject</th>
            <th>Marks</th>
            <th>Grade</th>
        </tr>
        <%
       		 List<Student> students = (List<Student>) request.getAttribute("students");
            if (students != null) {
                for (Student s : students) {
        %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getName() %></td>
            <td><%= s.getRollNo() %></td>
            <td><%= s.getSubject() %></td>
            <td><%= s.getMarks() %></td>
            <td><%= s.getGrade() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="6">No students found.</td>
        </tr>
        <% } %>
    </table>
</body>
</html>
