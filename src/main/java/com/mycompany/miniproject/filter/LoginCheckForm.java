package com.mycompany.miniproject.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginCheckForm implements Filter {
	
	@Override
	public void doFilter(ServletRequest request,
						 ServletResponse response,
						 FilterChain chain)
			throws IOException, ServletException {
		
		log.info("전처리 실행~~~~~");
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		
		String requestURI = httpServletRequest.getRequestURI();
		log.info("requestURI: " + requestURI);
		if(requestURI.contains("/mypage")) {
			HttpSession session = httpServletRequest.getSession();
			if(session.getAttribute("login") == null) {
				String contextPath = request.getServletContext().getContextPath();
				httpServletResponse.sendRedirect(contextPath + "/user/loginForm");
				return;
			}
		}
		chain.doFilter(request, response);
		
	}

}
