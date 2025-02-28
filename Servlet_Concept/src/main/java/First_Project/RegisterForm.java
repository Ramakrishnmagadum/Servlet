package First_Project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterForm extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     PrintWriter out=resp.getWriter();
     out.write("<h1> Register Page </h1>");
     
     String name=req.getParameter("user_name");
     String password=req.getParameter("user_password");
     String email=req.getParameter("user_email");
     String gender=req.getParameter("user_gender");
     String course=req.getParameter("course");
     String cond=req.getParameter("cond");
     
     if(cond!=null) {
    	 out.write("<h1>name :" +name +" </h1>");
    	 out.write("<h1>password :" +password +" </h1>");
    	 out.write("<h1>email :" +email +" </h1>");
    	 out.write("<h1>gender :" +gender +" </h1>");
    	 out.write("<h1>course :" +course +" </h1>");
    	 out.write("<h1> Accepted conditions and Terms </h1>");
    	 
    	 //Forwaed request Dispatcher ..it will forward this servlet(it will not include above printing statements) and only shows another servlet response..
    	 RequestDispatcher rd=req.getRequestDispatcher("Success");
    	 rd.forward(req, resp);
    	 
     }else {
    	 out.write("<h1>Condition and term not Accepeted...</h1>");
    	 
    	 //include request Dispatcher ..it will include this servlet response and next servlet response also....
    	 RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
    	 rd.include(req, resp);
     }
     
	}

}
