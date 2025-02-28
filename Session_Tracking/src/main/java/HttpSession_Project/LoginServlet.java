package HttpSession_Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
	
		if(password!=null && password.equals("Admin@123")) {
			//this line will create new HttpSession Object ....and it will able to manage the state..
			HttpSession session = req.getSession();
			//this will set the data into Session ..so we can get this values by using this session in anywhere 
			session.setAttribute("name", name);
			out.print("<h3> Welcome "+name+"</h3>");
			out.print("<h3> Login Successfully Done..</h3>");
			req.getRequestDispatcher("HttpSessionLink.html").include(req, resp);
		}else {
			out.print("<h3> Password is inncorrect</h3>");
			req.getRequestDispatcher("login.html").include(req, resp);
			
		}
	}

}
