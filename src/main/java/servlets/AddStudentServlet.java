package servlets;

import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/addStudent") 
public class AddStudentServlet extends HttpServlet {
    

	private static final long serialVersionUID = 1L;

	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form data
        String name = request.getParameter("name");
        String rollNo = request.getParameter("rollNo");
        String subject = request.getParameter("subject");
        int marks = Integer.parseInt(request.getParameter("marks"));
        String grade = request.getParameter("grade");

        // Insert into database using DAO
        boolean success = StudentDAO.addStudent(name, rollNo, subject, marks, grade);

        if (success) {
            // Redirect to student list page
            response.sendRedirect("students");
        } else {
            // Show error
            response.getWriter().println("❌ Failed to add student. Please try again.");
        }
    }
}
