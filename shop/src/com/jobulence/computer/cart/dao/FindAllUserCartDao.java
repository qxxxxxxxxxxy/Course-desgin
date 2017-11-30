package com.jobulence.computer.cart.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Repository
public class FindAllUserCartDao {
	@Resource
	private SessionFactory sessionFactory;
	
	
	public List<Cart>findAllCart(User u) {
		Set<Cart>set = u.getCart();
		List<Cart> list = new ArrayList<Cart>(set);
		return list;
	}
}
