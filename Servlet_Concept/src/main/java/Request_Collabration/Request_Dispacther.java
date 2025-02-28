package Request_Collabration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Request_Dispacther extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1=Integer.parseInt(req.getParameter("a"));
		int num2=Integer.parseInt(req.getParameter("b"));
		
		PrintWriter out=resp.getWriter();
		
		
		req.setAttribute("sum", num1+num2);
		
		req.getRequestDispatcher("RequestDispacther2").include(req, resp);;
		
	}

}
