package com.jobulence.computer.admin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.User;

/**
 * 显示所有的用户
 * @author 秦晓宇
 *
 */
@Repository
public class ShowUserDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<User>findAllUser() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from User u";
		Query query = session.createQuery(hql);
		List<User>list = query.list();
		return list;
	}
}
