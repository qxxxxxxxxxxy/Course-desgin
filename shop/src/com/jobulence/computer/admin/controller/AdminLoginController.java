package com.jobulence.computer.admin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("Admin")
public class AdminLoginController {

	@RequestMapping("/Login")
	public void adminLogin(HttpSession session , HttpServletResponse rp,@RequestParam("username") String name,
			@RequestParam("password") String password) {
		if(name.equals("admin") && password.equals("admin")) {
			try {
				session.setAttribute("jspName", "default.jsp");
				rp.sendRedirect("/shop1/houtaiguanli/Views/admin.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
