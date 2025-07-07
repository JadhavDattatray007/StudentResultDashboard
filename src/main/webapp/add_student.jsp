<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Student</title>
</head>
<body>
    <h2>Add New Student</h2>
    <form action="addStudent" method="post">
        <label>Name: <input type="text" name="name" required /></label><br><br>
        <label>Roll No: <input type="text" name="rollNo" required /></label><br><br>
        <label>Subject: <input type="text" name="subject" required /></label><br><br>
        <label>Marks: <input type="number" name="marks" required /></label><br><br>
        <label>Grade: <input type="text" name="grade" required /></label><br><br>
        <input type="submit" value="Add Student" />
    </form>
    <br>
    <a href="students">🔙 Back to Student List</a>
</body>
</html>
