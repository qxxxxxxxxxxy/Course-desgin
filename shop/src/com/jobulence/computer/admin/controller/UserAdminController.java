package com.jobulence.computer.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.admin.service.ShowUserService;
import com.jobulence.computer.entity.User;

@Controller
@RequestMapping("User")
public class UserAdminController {

	@Resource
	private ShowUserService showUserService;
	@RequestMapping("/showUser")
	public void showUser(@RequestParam("name") String name,HttpSession session,HttpServletResponse rp) {
		name = name + ".jsp";
		session.setAttribute("jspName", name);
		List<User>list = this.showUserService.showUser();
		session.setAttribute("userList", list);
		try {
			rp.sendRedirect("../houtaiguanli/Views/admin.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
