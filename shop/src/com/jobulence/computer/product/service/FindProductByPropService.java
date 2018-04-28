package com.jobulence.computer.product.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.Product;
import com.jobulence.computer.product.dao.FindProductByNameDao;

@Service
@Transactional
public class FindProductByPropService {

	@Resource
	private FindProductByNameDao findProductByNameDao;
	
	public Product findProductByName(String name) {
		return this.findProductByNameDao.FindProductByName(name);
	}
	
}
