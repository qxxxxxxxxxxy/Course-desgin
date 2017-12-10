package com.jobulence.computer.admin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.ProductType;

@Repository
public class ShowProductTypeDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<ProductType>showAllProductType(){
		String hql = "from ProductType p order by p.id";
		return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	}
}
