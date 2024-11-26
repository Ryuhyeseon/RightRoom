package com.kh.rightroom.admin;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.rightroom.vo.UserVO;

/*Handles requests for the application home page.*/

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminservice;
	
	@GetMapping("/userManagement")
	public String userManagement(HttpSession session, Model model) {
		String nextPage = "/admin/adminUserManagementPage";
		
		UserVO userVo = (UserVO)session.getAttribute("loginedUser");
		
		if(userVo.getUser_rank()==3) {
			List<UserVO> userVos = adminservice.selectAllUser();
			model.addAttribute("userVos",userVos);
			
		}else {
			
		}
		return nextPage;
	}
	
	@GetMapping("/companyUserManagement")
	public String companyUserManagement(HttpSession session, Model model) {
		String nextPage = "";
		
		UserVO userVo = (UserVO)session.getAttribute("loginedUser");
		
		if(userVo.getUser_rank()==3) {
			
			
		}else {
			
		}
		return nextPage;
	}
	
}