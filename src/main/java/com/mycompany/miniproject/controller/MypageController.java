package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/home")
public class MypageController {		
		@RequestMapping("/pick")
		public String pickMethod() {
			log.info("찜한상품");
			return "mypage/pick";
		}
		
		@RequestMapping("/orderList")
		public String orderListMethod() {
			log.info("주문내역");
			return "mypage/orderList";
		}
		
		@RequestMapping("/review")
		public String reviewMethod() {
			log.info("상품후기");
			return "mypage/review";
		}			
}