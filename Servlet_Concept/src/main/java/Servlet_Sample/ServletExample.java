package Servlet_Sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//for Servlet Interface all methods need to override..
public class ServletExample implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("this method will intialize once start the server ..and it will happen only once");
	}
	@Override
	public void destroy() {
		System.out.println("destroy method ");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.write("<h1>Servlet Interface Example</h1>");
		System.out.println("service method will run...");	
	}
}
