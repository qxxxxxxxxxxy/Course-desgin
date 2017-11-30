package com.jobulence.computer.user.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.entity.Userloginlogging;

@Repository
public class UserLoginDaoImpl {

	@Resource
	private SessionFactory sessionFactory;
	
	public User UserLogin(User a) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from User u where u.email = ? and u.password = ?";
		Query query = session.createQuery(hql);
		query.setParameter(0, a.getEmail());
		query.setParameter(1, a.getPassword());
		User u = (User)query.uniqueResult();
		return u;
	}
	
	public void saveUserloginlogging(Userloginlogging a ) {
		this.sessionFactory.getCurrentSession().save(a);
	}
}
