package com.jobulence.computer.user.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Orders;
import com.jobulence.computer.entity.User;

@Repository
public class UserRegistDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public List<User> findAll() {
		String hql = "from User";
		Query<User> query = this.sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	public void saveUser(User u) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(u);
	}
}
