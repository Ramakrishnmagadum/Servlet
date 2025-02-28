package HttpSession_Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfilePageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
//this line will get session if exists already
		HttpSession session = req.getSession(false);
		if(session!=null) {
		out.print("<h3> Welcome To Profile Page  " + session.getAttribute("name") + "</h3>");
		req.getRequestDispatcher("HttpSessionLink.html").include(req, resp);
		}else {
			out.print("<h3> First Register the User</h3>");
			req.getRequestDispatcher("HttpSessionLink.html").include(req, resp);
		}
	}

}
