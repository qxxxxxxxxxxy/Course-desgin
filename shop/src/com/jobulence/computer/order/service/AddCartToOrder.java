package com.jobulence.computer.order.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.DeleteCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.Order;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.order.dao.InsertIntoOrderDao;

@Service
@Transactional
public class AddCartToOrder {

	@Resource
	private DeleteCartDao deleteCartDao;
	
	@Resource
	private InsertIntoOrderDao insertIntoOrderDao;
	
	public void toOrder(ArrayList<Cart>list,User u) {
		HashSet<Order> o = (HashSet<Order>) u.getOrder();
		for (Cart cart : list) {
			String name = cart.getName();
			double price = cart.getPrice();
			String img = cart.getImg();
			int count = cart.getCount();
			String date = new Date().toString();
			Order order = new Order(date,name,count,price,img);
			o.add(order);
			this.insertIntoOrderDao.insertIntoOrder(order);
		}
		for (Cart cart : list) {
			this.deleteCartDao.deleteCartByName(cart.getName(), u);
		}
	}
}
