package com.jobulence.computer.user.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.entity.UserCart;

@Repository
public class GenerateUserCartDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public boolean generateUserCart(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from UserCart p where user_id = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, u.getId());
		UserCart a = (UserCart)query.uniqueResult();
		if(a != null) {
			return true;
		} else {
			a = new UserCart();
			u.setUserCart(a);
			a.setUser(u);
			session.save(a);
			return true;
		}
	}
}
