package com.jobulence.computer.cart.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.cart.service.DeleteCartService;
import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Controller
public class DeleteCart {

	@Resource
	private DeleteCartService deleteCartService;
	@Resource
	private FindTotalPriceService findTotalPriceService;
	@RequestMapping("delteCart")
	public void deleteAndUpdate(@RequestParam("cname") String name,HttpServletResponse rs,HttpSession session) {
		User u = (User)session.getAttribute("user");
		ArrayList<Cart> cartList = (ArrayList<Cart>) this.deleteCartService.delteCartAndUpdate(name,u);
		session.setAttribute("cartList", cartList);
		double c = this.findTotalPriceService.totalPrice(u);
		session.setAttribute("totalPrice", c);
		try {
			rs.sendRedirect("cart.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
