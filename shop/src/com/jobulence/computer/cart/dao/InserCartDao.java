package com.jobulence.computer.cart.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Repository
public class InserCartDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public void InsertIntoCartDao(Cart c,User u) {
		Session session = this.sessionFactory.getCurrentSession();
		User a = session.load(User.class, new Integer(u.getId()));
		a.getUserCart().getCart().add(c);
		c.setUserCart(u.getUserCart());
		session.save(c);
	}
}
