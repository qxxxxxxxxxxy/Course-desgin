package com.jobulence.computer.user.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.dao.UserRegistDaoImpl;

@Service
@Transactional(readOnly=true)
public class UserRegistService {

	@Resource
	private UserRegistDaoImpl userRegistDaoImpl;

	public boolean regist(User u) {
		ArrayList<User> list = (ArrayList<User>) this.userRegistDaoImpl.findAll();
		for (User user : list) {
			if (u.getName().equals(user.getName())) {
				return false;
			}
		}
		this.userRegistDaoImpl.saveUser(u);
		return true;
	}
}
