package Cookies_Tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies_Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		out.write("<h2> Welcome to First Servlet page </h2>");
		out.write("<h2> Hello "+ name +"</h2>");
		out.write("<h3> Your Password is  "+ password +"</h3>");
		out.write("<h3><a href='CookieServlet2'>Go to Servlet2</a></h3>");
		//adding cookies into the request ..... so in the servlet we can get this values ..and for next servlet it will consider as old request ...
		//if cookies are not added then .....next request it will consider as new request....
		Cookie cokkie=new Cookie("name", name);
		Cookie cokkie2=new Cookie("password", password);
		resp.addCookie(cokkie);
		resp.addCookie(cokkie2);
		
	}

}
