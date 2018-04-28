package com.jobulence.computer.admin.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jobulence.computer.admin.service.AddProductService;
import com.jobulence.computer.admin.service.AddProductTypeService;
import com.jobulence.computer.admin.service.DeleteProductService;
import com.jobulence.computer.admin.service.ShowAllProductService;
import com.jobulence.computer.admin.service.ShowProductTypeService;
import com.jobulence.computer.admin.service.UpdateProductService;
import com.jobulence.computer.entity.Product;
import com.jobulence.computer.entity.ProductType;


/**
 * 商品管理
 * @author 秦晓宇
 */
@Controller
@RequestMapping("Product")
public class ProductController {

	@Resource
	private ShowAllProductService showProductService;
	@Resource
	private ShowProductTypeService showProductTypeService;
	@Resource
	private UpdateProductService updateProductService;
	@Resource
	private DeleteProductService deleteProductService;
	@Resource
	private AddProductService addProductService;
	@Resource
	private AddProductTypeService addProductTypeService;
	/**
	 * 商品类型显示
	 * 内联使用
	 */
	@RequestMapping(value="/ProductType")
	public void productType(@RequestParam("name") String name, HttpSession session, HttpServletResponse rp) throws IOException {
		name = name + ".jsp";
		session.setAttribute("jspName", name);
		rp.sendRedirect("../houtaiguanli/Views/admin.jsp");
	}
	/**
	 * 商品添加显示页面
	 * 内联使用
	 */
	@RequestMapping(value="/showAddProduct",method=RequestMethod.GET)
	public void showAddProduct(@RequestParam("name") String name, HttpSession session, HttpServletResponse rp) throws IOException {
		name = name + ".jsp";
		session.setAttribute("jspName", name);
		rp.sendRedirect("../houtaiguanli/Views/admin.jsp");
	}
	/**
	 * 显示所有商品
	 * 并把内联用到的name添加到session
	 * 把所有的商品集合添加到session
	 */
	@RequestMapping("/showProduct")
	public void showAllProduct(@RequestParam("name") String name, HttpSession session, HttpServletResponse rp)
			throws IOException {
		name = name + ".jsp";
		session.setAttribute("jspName", name);
		List<Product> list = this.showProductService.showAllProduct();
		List<ProductType> plist = this.showProductTypeService.showProductTypeService();
		session.setAttribute("allProductType", plist);
		session.setAttribute("allProduct", list);
		rp.sendRedirect("../houtaiguanli/Views/admin.jsp");
	}

	/**
	 * 商品更新 
	 */
	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public void updateProduct(@RequestParam("productId") int id, @RequestParam("productName") String productName,
			@RequestParam("productPrice") double price, @RequestParam("productDiscount") double discount,
			@RequestParam("productDesc") String desc, @RequestParam("upfile") MultipartFile file,
			@RequestParam("productProducttype_id") int productProducttype_id, @RequestParam("img1") String img,
			@RequestParam("productTags") String tags,HttpSession session,
			HttpServletResponse rp, HttpServletRequest rq) throws IOException {
		String path = session.getServletContext().getRealPath("/");
		//判断图片是否为空
		if (file.isEmpty()) {
			this.updateProductService.updateProduct(id, productName, price, discount, desc, img, productProducttype_id,tags);
			rp.sendRedirect("../houtaiguanli/Views/admin.jsp");
		} else {

			String img1 = file.getOriginalFilename();
			img1 = "img/" + img1;
			FileCopyUtils.copy(file.getBytes(), new File(path+"\\img", file.getOriginalFilename()));
			this.updateProductService.updateProduct(id, productName, price, discount, desc, img1,
					productProducttype_id,tags);
			rp.sendRedirect("../houtaiguanli/Views/admin.jsp.jsp");
		}
}

	/**
	 * 商品删除
	 */
	@RequestMapping("/deleteProduct")
	public void delteProduct(@RequestParam("id") int id, HttpServletResponse rp,HttpServletRequest rq) {
		this.deleteProductService.delteProduct(id);
		String ItemPath = rq.getContextPath();
		try {
			rp.sendRedirect(ItemPath + "/Product/showProduct");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 商品添加
	 */
	@RequestMapping(value = "/addProduct",method=RequestMethod.POST )
	public void addProduct(@RequestParam("productName") String productName,
			@RequestParam("productPrice") double price, @RequestParam("productDiscount") double discount,
			@RequestParam("productDesc") String desc, @RequestParam("upfile") MultipartFile file,
			@RequestParam("productProducttype_id") int productProducttype_id,
			@RequestParam("productTags") String tags,HttpSession session,
			HttpServletResponse rp, HttpServletRequest rq) throws IOException {
		String img1 = file.getOriginalFilename();
		img1 = "img/" + img1;
		String path = session.getServletContext().getRealPath("/");
		//判断图片是否为空
		if(file.isEmpty()) {
			Product p = new Product(productName,price,discount,desc,img1,tags,productProducttype_id);
			this.addProductService.addProduct(p);
			rp.sendRedirect("../houtaiguanli/Views/showAddProduct.jsp");
		} else {
			FileCopyUtils.copy(file.getBytes(), new File( path + "\\img", file.getOriginalFilename()));
			Product p = new Product(productName,price,discount,desc,img1,tags,productProducttype_id);
			this.addProductService.addProduct(p);
			rp.sendRedirect("../houtaiguanli/Views/showAddProduct.jsp");
		}
	}
	/**
	 * 商品类型添加
	 */
	@RequestMapping(value="/addProductType",method=RequestMethod.POST)
	public void addProductType(@RequestParam("productType")String type ,HttpServletResponse rp) throws IOException {
		ProductType productType = new ProductType();
		productType.setType(type);
		this.addProductTypeService.addProductType(productType);
		rp.sendRedirect("../houtaiguanli/Views/addProductType.jsp");
	}
}
