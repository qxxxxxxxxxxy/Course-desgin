package com.jobulence.computer.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.ShowAllProductDao;
import com.jobulence.computer.entity.Product;

@Service
@Transactional
public class ShowAllProductService {

	@Resource
	private ShowAllProductDao showAllProductDao;
	
	public List<Product>showAllProduct(){
		return this.showAllProductDao.showAllProduct();
	}
}
