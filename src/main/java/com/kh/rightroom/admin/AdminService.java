package com.kh.rightroom.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.rightroom.user.UserDAO;
import com.kh.rightroom.vo.UserVO;

@Service
public class AdminService {
	
	@Autowired
	AdminDAO adminDao;
	
	public List<UserVO> selectAllUser(){
		return adminDao.selectAllUser();
	}
}
