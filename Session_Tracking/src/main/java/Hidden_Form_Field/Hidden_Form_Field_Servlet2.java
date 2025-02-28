package Hidden_Form_Field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hidden_Form_Field_Servlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name =req.getParameter("name");
		String password=req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.write("<h3>Welcome back to Servlet 2 </h3>");
		out.write("<h3>name is: "+name+" </h3>");
		out.write("<h3>password is: "+password+" </h3>");
		
	}
}
