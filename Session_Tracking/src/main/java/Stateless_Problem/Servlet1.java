package Stateless_Problem;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		resp.setContentType("text/html");
		out.write("<h2> Hello "+ name +"</h2>");
		out.write("<h2> Welcome to website </h2>");
		out.write("<div> <a href='Servlet2'> Second Servlet</a> </div>");
		
		
	}

}
