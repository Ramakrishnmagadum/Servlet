package CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		try {
			List<StudentsBean> list=StudentDao.getAllStudent();
			out.print("<h3>Students List</h3>");
			out.print("<table border='1' width='100%' > <tr><th>Roll Number</th><th>Name</th><th>Gender</th>"
					+ "<th>Subject</th><th>Country</th><th>Edit </th><th>Delete</th></tr>"
					+ "");
			for(StudentsBean list2:list) {
				out.print("<tr><td>"+list2.getRollno()+"</td><td>"+list2.getName()+"</td><td>"+
			list2.getGender()+"</td><td>"+list2.getSubject()+"</td><td>"+list2.getCountry()+"</td>"
					+ "<td><a href='EditServlet1?id="+list2.getRollno()+"'>Edit</a></td>"
					+ "<td><a href='DeleteServlet?id="+list2.getRollno()+"'>Delete</a></td></tr>");
			}
			out.print("</table>");
			out.print("<br><a href='index.html'>Add Student </a>");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
