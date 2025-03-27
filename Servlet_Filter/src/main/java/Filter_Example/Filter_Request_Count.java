package Filter_Example;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter_Request_Count implements Filter  {

	int count=0;
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Before Filter");
		
		chain.doFilter(request, response);
		
		
		count++;
		System.out.println("request count "+count);
		System.out.println("after Filter");
	}

}
