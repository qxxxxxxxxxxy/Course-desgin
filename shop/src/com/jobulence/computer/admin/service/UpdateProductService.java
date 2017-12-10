package com.jobulence.computer.admin.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.admin.dao.FindProductByIdDao;
import com.jobulence.computer.admin.dao.UpdateProductDao;
import com.jobulence.computer.entity.Product;

@Service
@Transactional
public class UpdateProductService {

	@Resource
	private FindProductByIdDao findProductById;
	
	@Resource
	private UpdateProductDao updateProductDao;
	public void updateProduct(int id,String name,double price,double discount,String desc,String img1,int productProducttype_id,String tags) {
		Product p = this.findProductById.findById(id);
		p.setName(name);
		p.setPrice(price);
		p.setDiscount(discount);
		p.setDesc(desc);
		p.setImg1(img1);
		p.setProducttype_id(productProducttype_id);
		p.setTags(tags);
		this.updateProductDao.updateProduct(p);
	}
}
