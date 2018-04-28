package com.jobulence.computer.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.dao.FindUserByIdDao;

@Service
@Transactional()
public class FindUserByIdService {
	
	@Resource
	private FindUserByIdDao findUserById;
	
	public User findUserById(User u) {
		return this.findUserById.findUserById(u);
	}
}
