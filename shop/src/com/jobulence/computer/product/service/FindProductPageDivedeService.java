package com.jobulence.computer.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.Product;
import com.jobulence.computer.product.dao.FindProductPageDivedeDao;

@Service
@Transactional(readOnly=true)
//二级缓存
@Cacheable(value="hello",key="#id")
public class FindProductPageDivedeService {

	@Resource
	private FindProductPageDivedeDao findProductDao;
	
	public List<Product>findLatestProductService() {
		return this.findProductDao.findLatestProduct();
	}
	
	public List<Product> findAllProductPageDivideService(int n) {
		return this.findProductDao.findAllProductPageDivideDao(n);
	}
	public List<Product> findComputerProductPageDivideService(int n) {
		return this.findProductDao.findComputerPageDivideDao(n);
	}
	public List<Product> findPhoneProductPageDivideService(int n) {
		return this.findProductDao.findPhonePageDivideDao(n);
	}
	public List<Product> findTvProductPageDivideService(int n) {
		return this.findProductDao.findTvPageDivideDao(n);
	}
	public List<Product> findMacbookProductPageDivideService(int n) {
		return this.findProductDao.findMacbookPageDivideDao(n);
	}
	public List<Product> findAirConditonerProductPageDivideService(int n) {
		return this.findProductDao.findAirConditonerPageDivideDao(n);
	}
	public List<Product> findPlayStationProductPageDivideService(int n) {
		return this.findProductDao.findPlaystationPageDivideDao(n);
	}
	public List<Product> findIpadProductPageDivideService(int n) {
		return this.findProductDao.findIpadPageDivideDao(n);
	}
}
