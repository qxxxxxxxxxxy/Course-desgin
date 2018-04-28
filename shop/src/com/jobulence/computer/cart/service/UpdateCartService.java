package com.jobulence.computer.cart.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.FindAllUserCartDao;
import com.jobulence.computer.cart.dao.UpdateCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.util.ArrayStringtoInteger;

@Service
@Transactional()

public class UpdateCartService {

	@Resource
	private UpdateCartDao updateCartDao;
	
	@Resource 
	private FindAllUserCartDao findAllCartDao;
	
	public List<Cart> updateCart(String[] count,String []name,User u) {
		//字符串数组转换为Integer数组
		Integer[] c = ArrayStringtoInteger.arrayStringtoInteger(count);
		this.updateCartDao.updateCart(c, name,u);
		ArrayList<Cart>cartList = (ArrayList<Cart>)this.findAllCartDao.findAllCart(u);
		return cartList;
	}
}
