package com.mycompany.miniproject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.miniproject.dao.UserLoginResult;
import com.mycompany.miniproject.interceptor.LoginCheck;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
	
		@RequestMapping("/getMethod")
		public String getMethod() {
			log.info("실행");
			return "user/getMethod";
		}
		
		@GetMapping("/getAtag")
		public String getAtag(String bno, String bkind) {
			log.info("실행");
			log.info("bno: " + bno);
			log.info("bkind: " + bkind);
			return "user/getMethod";
		}
		
		@GetMapping("/getAjax2")
		public String getAjax2(String bno, String bkind) {
			log.info("실행");
			log.info("bno: " + bno);
			log.info("bkind: " + bkind);
			return "user/ajaxJSON";
		}
		
		@GetMapping("/postMethod")
		public String postMethod() {
			log.info("실행");
			return "user/postMethod";
		}
		
		@PostMapping("/postFormTag")
		public String postFormTag(String bno, String bkind) {
			log.info("실행");
			log.info("bno: " + bno);
			log.info("bkind: " + bkind);
			return "user/postMethod";
		}
		
		@PostMapping("/postAjax1")
		public String postAjax1(String bno, String bkind) {
			log.info("실행");
			log.info("bno: " + bno);
			log.info("bkind: " + bkind);
			return "user/ajaxFragmentHtml";
		}
		
		@PostMapping("/postAjax2")
		public String postAjax2(String bno, String bkind) {
			log.info("실행");
			log.info("bno: " + bno);
			log.info("bkind: " + bkind);
			return "user/ajaxJSON";
		}
		
		@GetMapping("/returnModelAndView")
		public ModelAndView returnModelAndView() {
			log.info("실행");
			ModelAndView mav = new ModelAndView();
			mav.addObject("bno", 15);
			mav.addObject("bkind", "notice");
			mav.addObject("mid", "user1");
			mav.addObject("memail", "user1@mycompany.com");
			mav.setViewName("user/returnModelAndView");
			return mav;
		}
	
	
	
		@GetMapping("/returnVoid")
		public void returnVoid(HttpServletResponse response) throws IOException {
			log.info("실행");
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("result", "success");
			jsonObject.put("mid", "user1");
			String json = jsonObject.toString();
			log.info(json);	
			
			response.setContentType("application/json; charset=UTF-8");
			PrintWriter pw = response.getWriter();
			pw.println(json);
			pw.flush();
			pw.close();
		}
		
		@GetMapping(value="/returnObject", produces="application/json; charset=UTF-8")
		@ResponseBody
		public UserLoginResult returnObject() {
			log.info("실행");
			
			UserLoginResult obj = new UserLoginResult();
			obj.setResult("success");
			obj.setMid("user1");
			
			return obj;
		}
		
		@LoginCheck
		@GetMapping("/mypage")
		public String mypage() {
			log.info("실행");
			return "ch02/mypage";
		}				
		
		@GetMapping("/loginForm")
		public String loginForm() {
			log.info("실행");
			return "user/loginForm";
		}	
	
		@PostMapping("/login")
		public String login(String mid, String mpassword, HttpSession session) {
			log.info("로그인");
			log.info("mid: " + mid);
			log.info("mpassword: " + mpassword);
			session.setAttribute("login", mid);
			return "redirect:/";
		}
		
		@GetMapping("/logout")
		public String logout(HttpServletRequest session) {
			log.info("로그아웃");
			session.removeAttribute("login");
			return "redirect:/";
		}
}