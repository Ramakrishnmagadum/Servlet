package com.tech.blog.Servltes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.blog.Dao.UserDao;
import com.tech.blog.Entities.UserBean;
import com.tech.blog.helper.ConnectionProvider;

public class RegisterServlet extends   HttpServlet{
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter print = resp.getWriter();
		
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String password=req.getParameter("user_password");
		String gender=req.getParameter("gender");
		String about=req.getParameter("about");
		String check=req.getParameter("check");
		
		//this is condition need to checked all the time ...else throw msg 
		if(check ==null) {
			print.write("Check Term and Condtion Box");
			req.getRequestDispatcher("Register_Page.jsp").include(req, resp);
		}else {
		UserBean user=new UserBean();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setGender(gender);
		user.setAbout(about);
		
		
		UserDao dao=new UserDao(ConnectionProvider.getconnection());
		
		//if data saved successfully then return "DONE" msg else thow an Error ....
		if(dao.saveuser(user)) {
			print.write("Done Servlet");
		
		}else {
			print.write("Error  ");
		}
		}
		
		
		
		
	}
}
