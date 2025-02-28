package ServletContext_And_ServletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//in Servlet Config Properties are coming null Beacause
		//we are setting config properties for First Servlet and it will be only for Servlet1 . thats why its is not thier in Servlet2 ....
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("Name");
		String email=config.getInitParameter("Email");
		PrintWriter out2=resp.getWriter();
		out2.println("<h2> Name is "+name +" </h2>");
		out2.println("<h2> Email is "+email +" </h2>");
		
		
		
		//ServletContext Menas its is like Global Varible so if we decalre it , we can acces in servlets...
		ServletContext context=getServletContext();
		String sport=context.getInitParameter("Sport");
		PrintWriter out=resp.getWriter();
		out.println("<h2> Sport is "+sport +" </h2>");
		
		
	}

}
