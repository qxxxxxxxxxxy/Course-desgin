package com.jobulence.computer.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.ShowUserDao;
import com.jobulence.computer.entity.User;

@Service
@Transactional
public class ShowUserService {

	@Resource
	private ShowUserDao showUserDao;
	
	public List<User>showUser(){
		return this.showUserDao.findAllUser();
	}


}
