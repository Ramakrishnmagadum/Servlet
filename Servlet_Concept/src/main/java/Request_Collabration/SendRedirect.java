package Request_Collabration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendRedirect extends  HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//this line will get the Search Parameter --and Based on this Parameter it will Seach in Google 
		String url=req.getParameter("search");
		
		//this linkmwill redirect to google and based on givern paramter it will search
		//Imp : Whatever the given url will be visible in the screen...
		resp.sendRedirect("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN885G0&p="+url);
	}

}
