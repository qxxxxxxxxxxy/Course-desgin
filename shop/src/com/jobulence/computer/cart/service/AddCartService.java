package com.jobulence.computer.cart.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.cart.dao.AddCountDao;
import com.jobulence.computer.cart.dao.FindCartByNameDao;
import com.jobulence.computer.cart.dao.InserCartDao;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.Product;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.product.dao.FindProductByNameDao;

@Service
@Transactional()
public class AddCartService {

	@Resource
	private AddCountDao addCountDao;
	
	@Resource
	private FindCartByNameDao findCartByNameDao;
	
	@Resource
	private InserCartDao inserCartDao;
	
	@Resource 
	private FindProductByNameDao findProductByNameDao ;
	
	public boolean AddCartByName(String name,User u) {
		Cart a = this.findCartByNameDao.findCartByName(name,u);
		if(a == null) {
			Product p = this.findProductByNameDao.FindProductByName(name);
			Cart c = new Cart();
			c.setCount(1);
			c.setImg(p.getImg1());
			c.setName(p.getName());
			c.setPrice(p.getDiscount());
			c.setDate(new Date().toLocaleString());
			this.inserCartDao.InsertIntoCartDao(c, u);
			return true;
		} else {
			this.addCountDao.addCountDao(name,a);
			return true;
		}
	}
}
