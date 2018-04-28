package com.jobulence.computer.cart.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.dao.FindUserByIdDao;

@Repository
public class DeleteCartDao {

	@Resource
	private SessionFactory sessionFactory;

	@Resource
	private FindCartByNameDao findCartByNameDao;

	public void deleteCartByName(String name, User u) {
		Session session = this.sessionFactory.getCurrentSession();
		Cart c = this.findCartByNameDao.findCartByName(name, u);
		session.delete(c);
	}
}
