package com.jobulence.computer.order.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.Orders;
import com.jobulence.computer.entity.User;

@Repository
public class InsertIntoOrderDao {

	@Resource
	private SessionFactory sessionFactory;
	public void insertIntoOrder(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		User a = session.get(User.class, new Integer(u.getId()));
		Set<Cart> b = a.getCart();
		ArrayList<Cart>list = new ArrayList<Cart>(b);
		for (Cart cart : list) {
			String name = cart.getName();
			double price = cart.getPrice();
			String img = cart.getImg();
			int count = cart.getCount();
			String date = new Date().toLocaleString();
			Orders order = new Orders(date,name,count,price,img);
			a.getOrder().add(order);
			order.setUser(a);
			session.save(order);
		}
	}
}
