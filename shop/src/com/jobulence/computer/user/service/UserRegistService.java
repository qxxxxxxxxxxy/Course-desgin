package com.jobulence.computer.user.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.dao.GenerateUserCartDao;
import com.jobulence.computer.user.dao.GenerateUserOrderDao;
import com.jobulence.computer.user.dao.UserRegistDao;

@Service
@Transactional(readOnly=true)
public class UserRegistService {

	@Resource
	private UserRegistDao userRegistDaoImpl;
	@Resource
	private GenerateUserCartDao generateUserCartDao;
	@Resource
	private GenerateUserOrderDao generateUserOrderDao;
	
	public boolean regist(User u) {
		ArrayList<User> list = (ArrayList<User>) this.userRegistDaoImpl.findAll();
		for (User user : list) {
			if (u.getName().equals(user.getName())) {
				return false;
			}
		}
		this.userRegistDaoImpl.saveUser(u);
		if(this.generateUserCartDao.generateUserCart(u) && this.generateUserOrderDao.generateUserOrder(u)) {
			return true;
		}
		return false;
	}
}
