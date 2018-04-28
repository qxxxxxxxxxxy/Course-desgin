package com.jobulence.computer.cart.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Repository
public class FindAllUserCartDao {
	@Resource
	private SessionFactory sessionFactory;
	
	
	public List<Cart>findAllCart(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		User a = session.load(User.class, new Integer(u.getId()));
		Set<Cart>set = a.getUserCart().getCart();
		List<Cart> list = new ArrayList<Cart>(set);
		return list;
	}
}
