package ServletContext_And_ServletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ServletConfig we can get data because config properties we are setting for this particular servlet so here will get the parameter values....
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("Name");
		String email=config.getInitParameter("Email");
		PrintWriter out2=resp.getWriter();
		out2.println("<h2> Name is "+name +" </h2>");
		out2.println("<h2> Email is "+email +" </h2>");
		
		//ServletContext Means its is like Global Variable so if we declare it , we can access in servlets...
		ServletContext context=getServletContext();
		String sport=context.getInitParameter("Sport");
		PrintWriter out=resp.getWriter();
		out.println("<h2> Sport is "+sport +" </h2>");
		
		
	}
	

}
