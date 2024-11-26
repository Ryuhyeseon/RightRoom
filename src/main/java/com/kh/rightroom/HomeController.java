package com.kh.rightroom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*Handles requests for the application home page.*/

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/loginConfirm", method = RequestMethod.GET)
	public String loginConfirm() {
		return "index";
	}

	@GetMapping("/loginPage")
	public String login() {
		return "login/loginPage";
	}

	@GetMapping("/signUp")
	public String signUp() {
		return "login/signUp";
	}

	@GetMapping("/userJoinPage")
	public String userJoinPage() {
		return "user/userJoinPage";
	}

	@GetMapping("/companyJoinPage")
	public String companyJoinPage() {
		return "company/companyJoinPage";
	}
}