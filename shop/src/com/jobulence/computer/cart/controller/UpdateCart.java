package com.jobulence.computer.cart.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.cart.service.UpdateCartService;
import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Controller
public class UpdateCart {
	@Resource
	private UpdateCartService updateCartService;
	
	@Resource
	private FindTotalPriceService findTotalPriceService;

	@RequestMapping(value="update" ,method=RequestMethod.POST)
	public void updateCart(HttpSession session,HttpServletResponse rs,HttpServletRequest rq) {
		User u = (User)session.getAttribute("user");
		String[] count= rq.getParameterValues("nnn");
		String [] name = rq.getParameterValues("abcname");
		ArrayList<Cart>cartList = (ArrayList<Cart>) this.updateCartService.updateCart(count, name,u);
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
