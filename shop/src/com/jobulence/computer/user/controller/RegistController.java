package com.jobulence.computer.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.entity.User;
import com.jobulence.computer.user.service.UserRegistService;

/**
 * 用户注册
 * @author 秦晓宇
 *
 */
@Controller
@RequestMapping("user")
public class RegistController {

	@Resource
	private UserRegistService userRegistService;
	
	@RequestMapping("/regist")
	public String Regist(@RequestParam("name") String name,@RequestParam("country") String country,@RequestParam("companyname") String companyname,
			@RequestParam("address") String address,@RequestParam("town") String town,@RequestParam("county") String county,
			@RequestParam("postcode") int postcode,@RequestParam("email") String email,@RequestParam("phone") String phone,
			@RequestParam("password") String password) {
		User u = new User(name,country,companyname,address,town,county,postcode,email,phone,password);
		System.out.println(name);
		if (this.userRegistService.regist(u)) {
			return "login";
		} else {
			return "regist";
		}
	}
}
