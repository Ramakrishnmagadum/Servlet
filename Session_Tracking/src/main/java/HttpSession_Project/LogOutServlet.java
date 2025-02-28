package HttpSession_Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//this line will get session if exists else it will return null
		HttpSession session = req.getSession(false);
		if(session!=null) {
			//this line will expiry the existing the session ....or delete the exsisting session...
			session.invalidate();
		out.print("<h3> Logout Successfully Done..</h3>");
		req.getRequestDispatcher("HttpSessionLink.html").include(req, resp);
		}else {
			out.print("<h3>No Session To Logout</h3>");
			req.getRequestDispatcher("HttpSessionLink.html").include(req, resp);
		}
	}

}
