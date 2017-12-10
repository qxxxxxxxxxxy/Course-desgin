package com.jobulence.computer.admin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.DeleteProductDao;
import com.jobulence.computer.admin.dao.FindProductByIdDao;
import com.jobulence.computer.entity.Product;

@Service
@Transactional
public class DeleteProductService {

	@Resource
	private FindProductByIdDao findProductById;
	@Resource
	private DeleteProductDao delteProductDao;
	public void delteProduct(int id) {
		Product p = this.findProductById.findById(id);
		this.delteProductDao.deleteProduct(p);
	}
}
