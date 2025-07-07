package servlets;

import java.io.IOException;
import java.util.List;

import dao.StudentDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;

@WebServlet("/students") 
public class StudentListServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = StudentDAO.getAllStudents();

        System.out.println("StudentListServlet hit!Start");

        request.setAttribute("students", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("student_list.jsp");
        System.out.println("StudentListServlet hit!Mid");
        System.out.println("Students fetched: " + studentList.size());
        dispatcher.forward(request, response);
        System.out.println("StudentListServlet hit!end");

    }
}
