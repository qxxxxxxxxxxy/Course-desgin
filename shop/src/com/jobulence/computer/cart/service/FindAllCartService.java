package com.jobulence.computer.cart.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.FindAllUserCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Service
@Transactional()
public class FindAllCartService {
	
	@Resource
	private FindAllUserCartDao findAllCartDao;
	
	public List<Cart> allCart(User u){
		return this.findAllCartDao.findAllCart(u);
	}
}
