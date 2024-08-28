package com.mycompany.miniproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class OrderController {
	@RequestMapping("/pay")
	public String payMethod() {
		log.info("주문/결제");
		return "order/pay";
	}
}