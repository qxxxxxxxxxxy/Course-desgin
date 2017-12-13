package com.jobulence.computer.admin.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

/**
 * 添加产品
 * @author 秦晓宇
 *
 */
@Repository
public class AddProductDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public void addProduct(Product p) {
		this.sessionFactory.getCurrentSession().save(p);
	}
}
