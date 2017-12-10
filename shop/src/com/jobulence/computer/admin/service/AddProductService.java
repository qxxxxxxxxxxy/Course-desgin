package com.jobulence.computer.admin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.AddProductDao;
import com.jobulence.computer.entity.Product;

@Service
@Transactional
public class AddProductService {

	@Resource
	private AddProductDao addProductDao;
	
	public void addProduct(Product p) {
		this.addProductDao.addProduct(p);
	}
}
