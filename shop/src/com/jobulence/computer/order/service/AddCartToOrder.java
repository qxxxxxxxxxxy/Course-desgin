package com.jobulence.computer.order.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.DeleteCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.Orders;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.order.dao.InsertIntoOrderDao;

@Service
@Transactional
public class AddCartToOrder {

	@Resource
	private DeleteCartDao deleteCartDao;
	
	@Resource
	private InsertIntoOrderDao insertIntoOrderDao;
	
	public void toOrder(User u) {
		this.insertIntoOrderDao.insertIntoOrder(u);
		Set<Cart> b = u.getUserCart().getCart();
		ArrayList<Cart>list = new ArrayList<Cart>(b);
		for (Cart cart : list) {
			this.deleteCartDao.deleteCartByName(cart.getName(), u);
		}
	}
}
