package com.jobulence.computer.cart.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.cart.service.AddCartService;
import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.cart.service.FindUserCartQuantity;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.service.FindUserByIdService;

/**
 * 购物车添加
 * @author 秦晓宇
 *
 */
@Controller
public class AddProductTocartController {

	@Resource
	private AddCartService addCartService;
	@Resource
	private FindUserByIdService findUserByIdService;
	@Resource
	private FindUserCartQuantity findUserCartQuantity;
	@Resource
	private FindTotalPriceService findTotalPriceService;
	
	/**
	 * 首页商品添加
	 * addCart添加购物车,并且通过session里的user查出已经在购物车的商品总价和数量
	 * @param name获取商品
	 * @param session
	 * @param rs
	 */
	@RequestMapping("addTocartT")
	public void addCart(@RequestParam("productname") String name,HttpSession session,HttpServletResponse rs) {
		User b = (User)session.getAttribute("user");
		this.addCartService.AddCartByName(name, b);
		User a = this.findUserByIdService.findUserById(b);
		session.setAttribute("user", a);
		int nn = this.findUserCartQuantity.find(a);
		session.setAttribute("quantity", nn);
		double mm = this.findTotalPriceService.totalPrice(a);
		session.setAttribute("totalPrice", mm);
		try {
			rs.sendRedirect("index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * shop页商品添加
	 * 添加购物车,并且通过session里的user查出已经在购物车的商品总价和数量
	 * @param name
	 * @param session
	 * @param rs
	 */
	@RequestMapping("addTocart")
	public void addToCart(@RequestParam("productname") String name,HttpSession session,HttpServletResponse rs) {
		User b = (User)session.getAttribute("user");
		this.addCartService.AddCartByName(name, b);
		User a = this.findUserByIdService.findUserById(b);
		session.setAttribute("user", a);
		int nn = this.findUserCartQuantity.find(a);
		session.setAttribute("quantity", nn);
		double mm = this.findTotalPriceService.totalPrice(a);
		session.setAttribute("totalPrice", mm);
		try {
			rs.sendRedirect("shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
