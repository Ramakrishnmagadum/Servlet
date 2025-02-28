package Cookies_Tracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies_Servlet2  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		String name;
		String password;
		Cookie[] cookies = req.getCookies();
		boolean flag=false;
		if(cookies!=null) {
			 name=cookies[0].getValue();
			 password=cookies[1].getValue();
			flag=true;
			
		}else {
			out.write("<h2> First Register Username and password then come this page </h2>");
			return ;
		}
	
		if(flag) {
		out.write("<h2> Welcome to Our World ..Hello "+ name +"</h2>");
		out.write("<h3> Your Password is  "+ password +"</h3>");
		
		out.write("<div>Succesfully Register is Done....</div>");
		}
	}
}
