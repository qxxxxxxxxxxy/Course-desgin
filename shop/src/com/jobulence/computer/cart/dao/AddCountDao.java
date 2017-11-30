package com.jobulence.computer.cart.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.Cart;

@Repository
public class AddCountDao {

	@Resource
	private SessionFactory sessionFactory;

	public void addCountDao(String name,Cart d) {
		Session session = this.sessionFactory.getCurrentSession();
		int a = d.getCount();
		d.setCount(++a);
		session.update(d);
	}
}
