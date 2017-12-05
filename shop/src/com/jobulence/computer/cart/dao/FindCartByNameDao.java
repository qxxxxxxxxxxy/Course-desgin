package com.jobulence.computer.cart.dao;

import java.util.ArrayList;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;
@Repository
public class FindCartByNameDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public Cart findCartByName(String name,User u) {
		Session session = this.sessionFactory.getCurrentSession();
		User a = session.get(User.class, new Integer(u.getId()));
		Set<Cart>set = a.getUserCart().getCart();
		ArrayList<Cart>list = new ArrayList<Cart>(set);
		for (Cart cart : list) {
			if(cart.getName().equals(name)) {
				return cart;
			}
		}
		return null;
	}
}