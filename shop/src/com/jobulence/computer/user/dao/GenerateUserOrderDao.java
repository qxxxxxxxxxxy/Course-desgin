package com.jobulence.computer.user.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.entity.UserOrder;

@Repository
public class GenerateUserOrderDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public boolean generateUserOrder(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from UserOrder u where user_id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, u.getId());
		UserOrder order = (UserOrder)query.uniqueResult();
		if(order == null) {
			order = new UserOrder();
			order.setUser(u);
			u.setUserOrder(u.getUserOrder());
			session.save(order);
			return true;
		}
		return false;
	}
}
