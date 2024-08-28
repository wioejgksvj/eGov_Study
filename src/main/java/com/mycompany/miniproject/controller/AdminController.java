package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/home")
public class AdminController {
	@RequestMapping("/goodsAdmin")
	public String goodsAdminMethod() {
		log.info("상품관리");
		return "admin/goodsAdmin";
	}
	
	@RequestMapping("/faq")
	public String faqMethod() {
		log.info("FAQ관리");
		return "admin/faq";
	}
		@RequestMapping("/notice")
		public String noticeMethod() {
			log.info("공지사항");
			return "admin/notice";
		}
		
		@RequestMapping("/answer")
		public String answerMethod() {
			log.info("문의관리");
			return "admin/answer";
		}
}