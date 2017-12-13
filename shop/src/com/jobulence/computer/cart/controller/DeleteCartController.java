package com.jobulence.computer.cart.controller;

import java.util.ArrayList;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.cart.service.DeleteCartService;
import com.jobulence.computer.cart.service.FindUserAllCartService;
import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.cart.service.FindUserCartQuantity;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.service.FindUserByIdService;

/**
 * 商品删除
 * @author 秦晓宇
 *
 */
@Controller
public class DeleteCartController {

	@Resource
	private DeleteCartService deleteCartService;
	@Resource
	private FindTotalPriceService findTotalPriceService;
	@Resource
	private FindUserAllCartService findAllCartService;
	@Resource
	private FindUserByIdService findUserByIdService;
	@Resource
	private FindUserCartQuantity findUserCartQuantity;
	/**
	 * 删除并且更新购物车
	 * @param name
	 * @param rs
	 * @param session
	 * @return
	 */
	@RequestMapping("delteCart")
	public String deleteAndUpdate(@RequestParam("cname") String name,HttpServletResponse rs,HttpSession session) {
		User u = (User)session.getAttribute("user");
		this.deleteCartService.delteCartAndUpdate(name,u);
		User a = this.findUserByIdService.findUserById(u);
		ArrayList<Cart>cartList = (ArrayList<Cart>) this.findAllCartService.allCart(a);
		session.setAttribute("cartList", cartList);
		double c = this.findTotalPriceService.totalPrice(a);
		session.setAttribute("totalPrice", c);
		int nn = this.findUserCartQuantity.find(a);
		session.setAttribute("quantity", nn);
		return "cart";
	}
	
}
