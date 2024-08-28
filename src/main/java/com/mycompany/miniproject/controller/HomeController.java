package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller /*스프링에서 홈컨트롤러를 자동으로 객체 생성*/
@Slf4j

public class HomeController {
	
	@RequestMapping("")
	public String homeMethod() {
		log.info("홈");
		return "home";
	}
	
	@RequestMapping("/signup")
	public String signupMethod() {
		log.info("회원가입");
		return "home/signup";
	}
	
	@RequestMapping("/login")
	public String loginMethod() {
		log.info("로그인");
		return "home/login";
	}
	
	@RequestMapping("/category")
	public String categoryMethod() {
		log.info("카테고리");
		return "home/category";
	}
	
	@RequestMapping("/mypage")
	public String mypageMethod() {
		log.info("마이페이지");
		return "home/mypage";
	}		
		
	@RequestMapping("/detail")
	public String detailMethod() {
		log.info("상세페이지");
		return "home/detail";
	}			
}
