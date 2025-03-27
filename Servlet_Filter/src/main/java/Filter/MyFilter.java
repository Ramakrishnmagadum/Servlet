package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//this will when cilent send request to the server , 
		//before reaching requst to server , it will come to this filter class , this logic will run 
		//it is like preprocessing ..
	System.out.println("before Filter ");
	
	//this will redirect the request to the servlet 
		chain.doFilter(request, response);
		
		//this will trigger when response is comming back from servlet ..
		//like postprocessing
		System.out.println("after filter");
		
	}
	

}
