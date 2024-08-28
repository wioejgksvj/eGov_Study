package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class GoodsController {
	@RequestMapping("/goodsList")
	public String goodsListMethod() {
		log.info("전체보기");
		return "goods/goodsList";
	}
		@RequestMapping("/snack")
		public String snackMethod() {
			log.info("분식");
			return "goods/snack";
		}
		
		@RequestMapping("/korea")
		public String koreanMethod() {
			log.info("한식");
			return "goods/korea";
		}
		
		@RequestMapping("/western")
		public String westernMethod() {
			log.info("양식");
			return "goods/western";
		}
		
		@RequestMapping("/drink")
		public String drinkMethod() {
			log.info("전통주");
			return "goods/drink";
		}
}