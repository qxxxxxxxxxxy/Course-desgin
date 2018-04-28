package com.jobulence.computer.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.ShowProductTypeDao;
import com.jobulence.computer.entity.ProductType;

@Service
@Transactional
public class ShowProductTypeService {

	@Resource
	private ShowProductTypeDao showProductType;
	
	public List<ProductType>showProductTypeService(){
		return this.showProductType.showAllProductType();
	}
}
