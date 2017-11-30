package com.jobulence.computer.cart.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Repository
public class UpdateCartDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Resource
	private FindCartByNameDao findCartByNameDao;
	
	public void updateCart(Integer[] count,String name[],User u) {
		Session session = this.sessionFactory.getCurrentSession();
		for(int i = 0;i<name.length;i++) {
			Cart c = this.findCartByNameDao.findCartByName(name[i],u);
			if(c != null) {
				c.setCount(count[i]);
				session.update(c);
			}
		}
	}
}
