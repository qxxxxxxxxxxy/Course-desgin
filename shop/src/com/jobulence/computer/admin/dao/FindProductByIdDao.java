package com.jobulence.computer.admin.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

/**
 * 通过id找到产品
 * @author 秦晓宇
 *
 */
@Repository
public class FindProductByIdDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public Product findById(int id) {
		return this.sessionFactory.getCurrentSession().get(Product.class, id);
	}
}
