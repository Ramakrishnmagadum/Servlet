package Url_Rewriting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Url_Rewriting_Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name =req.getParameter("user_name");
		String password=req.getParameter("password");
		
		PrintWriter out=resp.getWriter();
		out.write("<h3>name is: "+name+" </h3>");
		out.write("<h3>password is: "+password+" </h3>");
		out.write("<a href='UrlRewriting2?name="+name+"&password="+password+"'>Servlet 2</a>");
		
	}

}
