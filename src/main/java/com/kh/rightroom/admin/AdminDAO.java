package com.kh.rightroom.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kh.rightroom.vo.UserVO;

@Component
public class AdminDAO {

	public List<UserVO> selectAllUser(){
		String sql = "SELECT * FROM USER"
				+ "WHERE user_rank = 1";
		
		List<UserVO> userVos = new ArrayList<UserVO>();
		
		try {
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userVos;
	}
}
