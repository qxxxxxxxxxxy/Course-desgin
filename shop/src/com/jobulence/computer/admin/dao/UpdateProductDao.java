package com.jobulence.computer.admin.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

/**
 * 更新产品
 * @author 秦晓宇
 *
 */
@Repository
public class UpdateProductDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public void updateProduct(Product p) {
		this.sessionFactory.getCurrentSession().update(p);
	}
}
