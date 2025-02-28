package Stateless_Problem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		//here name will not remember it will come as null,  because it treat Every request as New Request and all the data  it will forget .....
		//for this only will do session tracking , to help remember the username and so on things for particular period of time.....
		
		String name=req.getParameter("name");
		resp.setContentType("text/html");
		out.write("<h2> Hello "+ name +"</h2>");
		out.write("<h2> Welcome Back to website </h2>");	
	}

}
