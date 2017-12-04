package com.jobulence.computer.user.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.dao.FindUserById;

@Service
@Transactional(readOnly=true)
public class FindUserByIdService {
	
	@Resource
	private FindUserById findUserById;
	
	public User findUserById(User u) {
		return this.findUserById.findUserById(u);
	}
}
