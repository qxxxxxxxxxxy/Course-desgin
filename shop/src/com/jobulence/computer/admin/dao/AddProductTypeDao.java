package com.jobulence.computer.admin.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.ProductType;

@Repository
public class AddProductTypeDao {
	@Resource
	private SessionFactory sessionFactory;
	
	public void addProductTypeDao(ProductType productType) {
		this.sessionFactory.getCurrentSession().save(productType);
	}
}
