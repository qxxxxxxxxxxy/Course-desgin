package com.jobulence.computer.user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.cart.service.FindTotalPriceService;
import com.jobulence.computer.cart.service.FindUserCartQuantity;
import com.jobulence.computer.entity.Product;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.product.service.FindProductPageDivedeService;
import com.jobulence.computer.user.service.FindUserByIdService;
import com.jobulence.computer.user.service.UserLoginService;

/**
 * 用户登录
 * @author 秦晓宇
 *
 */
@Controller
@RequestMapping("User")
public class LoginController {

	@Resource
	private UserLoginService userLoginService;
	
	@Resource
	private FindProductPageDivedeService findProductService;
	@Resource
	private FindUserCartQuantity findUserCartQuantity;
	@Resource
	private FindTotalPriceService findTotalPriceService;
	@Resource
	private FindUserByIdService findUserByIdService;
	@RequestMapping(value="/login",method=RequestMethod.POST)
	/**
	 * 用户登录,登录后把用户存到session里
	 * @param email
	 * @param password
	 * @param rs
	 * @param session
	 */
	public void login(@RequestParam("email") String email, @RequestParam("password") String password,HttpServletResponse rs,
			HttpSession session) {
		User a = new User();
		a.setEmail(email);
		a.setPassword(password);
		User c = this.userLoginService.UserLogin(a);
		if(c != null) {
			ArrayList<Product>latestList = (ArrayList<Product>) this.findProductService.findLatestProductService();
			session.setAttribute("latestList", latestList);
			User b = this.findUserByIdService.findUserById(c);
			session.setAttribute("user", b);
			int nn = this.findUserCartQuantity.find(b);
			double mm = this.findTotalPriceService.totalPrice(b);
			session.setAttribute("quantity", nn);
			session.setAttribute("totalPrice", mm);
			try {
				rs.sendRedirect("../index.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			String wrong = "用户名或密码错误";
			session.setAttribute("wrong", wrong);
			try {
				rs.sendRedirect("../login.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
