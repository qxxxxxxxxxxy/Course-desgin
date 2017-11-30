package com.jobulence.computer.product.dao;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jobulence.computer.entity.Product;

@Repository
public class FindProductPageDivedeDao {
	
	@Resource
	private SessionFactory sessionFactory;
	
	public List<Product> findLatestProduct() {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p order by p.id desc";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findAllProductPageDivideDao(int n){
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p ";
		Query query = session.createQuery(hql);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(12);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findComputerPageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 1);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findPhonePageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 2);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findTvPageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 3);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findMacbookPageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 4);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findAirConditonerPageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 5);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findPlaystationPageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 6);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
	public List<Product> findIpadPageDivideDao(int n) {
		Session session = this.sessionFactory.getCurrentSession();
		String hql = "from Product p where p.producttype = ? ";
		Query query = session.createQuery(hql);
		query.setParameter(0, 7);
		query.setFirstResult((n-1)*12);
		query.setMaxResults(6);
		List<Product> list = query.list();
		return list;
	}
}
