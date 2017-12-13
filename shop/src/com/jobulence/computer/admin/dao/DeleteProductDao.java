package com.jobulence.computer.admin.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

/**
 * 删除产品
 * @author 秦晓宇
 *
 */
@Repository
public class DeleteProductDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public void deleteProduct(Product p) {
		this.sessionFactory.getCurrentSession().delete(p);
	}
}
