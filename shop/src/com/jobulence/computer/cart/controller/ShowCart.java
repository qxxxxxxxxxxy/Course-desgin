package com.jobulence.computer.cart.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobulence.computer.cart.service.FindUserAllCartService;
import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.cart.service.FindUserCartQuantity;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Controller
public class ShowCart {

	@Resource
	private FindUserAllCartService findAllCartService;
	@Resource
	private FindTotalPriceService findTotalPriceService;
	@RequestMapping("showCart")
	public void showCart(HttpSession session,HttpServletResponse rs) {
		User u = (User)session.getAttribute("user");
		ArrayList<Cart> cartList = (ArrayList<Cart>)this.findAllCartService.allCart(u);
		double c = this.findTotalPriceService.totalPrice(u);
		session.setAttribute("totalPrice", c);
		session.setAttribute("cartList", cartList);
		try {
			rs.sendRedirect("cart.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
