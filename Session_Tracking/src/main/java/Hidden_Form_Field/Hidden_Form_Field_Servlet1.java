package Hidden_Form_Field;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hidden_Form_Field_Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("user_name");
		String password = req.getParameter("password");

		PrintWriter out = resp.getWriter();
		out.write("<h3>name is: " + name + " </h3>");
		out.write("<h3>password is: " + password + " </h3>");
		out.print("<form action='HiddenForm2'>");
		out.print("<input type='hidden' name='name' value='" + name + "'>");
		out.print("<input type='hidden' name='password' value='" + password + "'>");
		out.print("<input type='submit' value='Submit'>");
		out.print("</form>");

	}

}
