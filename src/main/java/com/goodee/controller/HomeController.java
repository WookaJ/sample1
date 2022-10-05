package com.goodee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Controller에서 webServlet()안의 경로를 의미하는 것이 value="/"이다
	@RequestMapping(value = "/")
	public String home() {
		System.out.println("HomeController.home()");
		return "index";
	}
}
