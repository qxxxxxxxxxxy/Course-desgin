package com.jobulence.computer.admin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("User")
public class UserAdminController {

	@RequestMapping("/showUser")
	public void showUser(@RequestParam("name") String name,HttpSession session,HttpServletResponse rp) {
		name = name + ".jsp";
		session.setAttribute("jspName", name);
		try {
			rp.sendRedirect("../houtaiguanli/Views/admin.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
