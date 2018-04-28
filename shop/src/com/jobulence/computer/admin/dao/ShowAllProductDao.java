package com.jobulence.computer.admin.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

/**
 * 显示所有商品
 * @author 秦晓宇
 *
 */
@Repository
public class ShowAllProductDao {

	@Resource
	private SessionFactory sessionFactory;
	
	public List<Product> showAllProduct(){
		String hql = "from Product p";
		return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	}
}
