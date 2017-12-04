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
import com.jobulence.computer.cart.service.FindAllCartService;
import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.service.FindUserByIdService;

@Controller
public class DeleteCart {

	@Resource
	private DeleteCartService deleteCartService;
	@Resource
	private FindTotalPriceService findTotalPriceService;
	@Resource
	private FindAllCartService findAllCartService;
	@Resource
	private FindUserByIdService findUserByIdService;
	@RequestMapping("delteCart")
	public String deleteAndUpdate(@RequestParam("cname") String name,HttpServletResponse rs,HttpSession session) {
		User u = (User)session.getAttribute("user");
		Set<Cart>cart = u.getCart();
		for (Cart cart2 : cart) {
			System.out.println(cart2.getName());
		}
		this.deleteCartService.delteCartAndUpdate(name,u);
		User a = this.findUserByIdService.findUserById(u);
		Set<Cart>cart1 = a.getCart();
		for (Cart cart2 : cart1) {
			System.out.println(cart2.getName());
		}
		ArrayList<Cart>cartList = (ArrayList<Cart>) this.findAllCartService.allCart(a);
		session.setAttribute("cartList", cartList);
		double c = this.findTotalPriceService.totalPrice(a);
		session.setAttribute("totalPrice", c);
		return "cart";
	}
	
}
