package com.jobulence.computer.cart.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.FindAllUserCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Service
@Transactional()
public class FindTotalPriceService {

	@Resource
	private FindAllUserCartDao findAllCartDao;
	
	public double totalPrice(User u) {
		List<Cart> list = this.findAllCartDao.findAllCart(u);
		double a = 0;
		for (Cart cart : list) {
			a = a + cart.getCount()*cart.getPrice();
		}
		return a;
	}
}
