package com.jobulence.computer.cart.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.DeleteCartDao;
import com.jobulence.computer.cart.dao.FindAllUserCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Service
@Transactional
public class DeleteCartService {

	@Resource
	private DeleteCartDao deleteCartDao;
	
	@Resource
	private FindAllUserCartDao findAllCartDao;
	
	public void delteCartAndUpdate(String name,User u){
		this.deleteCartDao.deleteCartByName(name,u);
	}
}
