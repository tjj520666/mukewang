package com.controllr;


import javax.servlet.*;
import java.io.IOException;


public class CodeFilter implements Filter{

	private String codestr = null;
	
	public void destroy() {
		//System.out.println("---destroy()");
		codestr = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain arg2) throws IOException, ServletException {
		//System.out.println("---doFilter()");
		if(codestr != null){
			request.setCharacterEncoding(codestr);//请求乱码
			response.setCharacterEncoding(codestr);//响应乱码
			response.setContentType("text/html;charset="+codestr);
		}
		
		arg2.doFilter(request, response);//放行
	}
	
	public void init(FilterConfig arg0) throws ServletException {
		//System.out.println("---init()");
		codestr = arg0.getInitParameter("codestr");
		System.out.println(" codestr = "+codestr);
	}

}
