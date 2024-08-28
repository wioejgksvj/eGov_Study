package com.mycompany.miniproject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginCheckInterceptor implements HandlerInterceptor {
	@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
			log.info("실행");

			try {
				HandlerMethod handlerMethod = (HandlerMethod) handler;
				LoginCheck loginCheck = handlerMethod.getMethodAnnotation(LoginCheck.class);
				if(loginCheck == null) {
					log.info("@LoginCheck가 붙어있지 않음");
				} else {
					log.info("@LoginCheck가 붙어있음");
					
					HttpSession session = request.getSession();
					String login = (String) session.getAttribute("login");
					if(login == null) {
						String contextPath = request.getContextPath();
						response.sendRedirect(contextPath + "/user/loginForm");
						return false;
					} else {
						
					}
				}
			} catch(Exception e) {
		}
			return true;
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
			log.info("실행");
	}
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
			log.info("실행");
	}

}
