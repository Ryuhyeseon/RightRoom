package com.kh.rightroom.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.rightroom.vo.UserVO;

/*Handles requests for the application home page.*/

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/JoinConfirm")
	public String JoinConfirm(UserVO userVO) {
		int result = userService.JoinConfirm(userVO);
		
		if (result <=0) {
			}
		
		return "index";
	}
		
	

}