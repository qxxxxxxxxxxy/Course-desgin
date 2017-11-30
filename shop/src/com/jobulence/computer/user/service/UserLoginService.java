package com.jobulence.computer.user.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.entity.Userloginlogging;
import com.jobulence.computer.user.dao.UserLoginDaoImpl;

@Service
@Transactional
public class UserLoginService {

	@Resource
	private UserLoginDaoImpl userLoginDaoImpl;
	
	public User UserLogin(User a) {
		User b = this.userLoginDaoImpl.UserLogin(a);
		if(b != null) {
			Userloginlogging c = new Userloginlogging(b.getId(),b.getName(),new Date().toLocaleString()); 
			//this.userLoginDaoImpl.saveUserloginlogging(c);
			return b;
		} else {
			return null;
		}
	}
}
