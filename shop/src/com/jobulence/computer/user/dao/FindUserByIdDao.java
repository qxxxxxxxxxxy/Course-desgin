package com.jobulence.computer.user.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.User;

@Repository
public class FindUserByIdDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public User findUserById(User u) {
		return this.sessionFactory.getCurrentSession().get(User.class, u.getId());
	}
}
