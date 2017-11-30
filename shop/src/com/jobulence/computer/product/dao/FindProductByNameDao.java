package com.jobulence.computer.product.dao;

import javax.annotation.Resource;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

@Repository
public class FindProductByNameDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public Product FindProductByName(String name) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.name= ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, name);
		return (Product)query.uniqueResult();
	}
}
