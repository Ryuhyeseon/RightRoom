package com.kh.rightroom.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.rightroom.vo.UserVO;

@Service
public class UserService {

	@Autowired
	UserDAO userDAO;
	
	public int JoinConfirm(UserVO userVO) {
		userDAO.insertUser(userVO);
		return 0;
	}
}
