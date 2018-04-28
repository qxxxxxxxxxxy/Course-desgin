package com.jobulence.computer.admin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.AddProductTypeDao;
import com.jobulence.computer.entity.ProductType;

@Service
@Transactional
public class AddProductTypeService {
	@Resource
	private AddProductTypeDao addProductTypeDao;
	
	public void addProductType(ProductType productType) {
		this.addProductTypeDao.addProductTypeDao(productType);
	}
}
