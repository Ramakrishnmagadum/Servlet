package CRUD;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int rollno=Integer.parseInt(req.getParameter("rollno"));
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String subject=req.getParameter("subject");
		String country =req.getParameter("country");
		StudentsBean bean=new StudentsBean();
		bean.setRollno(rollno);
		bean.setName(name);
		bean.setSubject(subject);
		bean.setCountry(country);
		bean.setGender(gender);
		try {
			StudentDao.updateStudent(bean);
			resp.sendRedirect("ViewServlet");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
