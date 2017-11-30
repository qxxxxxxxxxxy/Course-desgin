package com.jobulence.computer.order.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Order;

@Repository
public class InsertIntoOrderDao {

	@Resource
	private SessionFactory sessionFactory;
	public void insertIntoOrder(Order o) {
		this.sessionFactory.getCurrentSession().save(o);
	}
}
