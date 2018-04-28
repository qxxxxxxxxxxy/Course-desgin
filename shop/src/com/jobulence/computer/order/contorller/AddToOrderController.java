package com.jobulence.computer.order.contorller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;
import com.jobulence.computer.order.service.AddCartToOrder;

/**
 * 添加到订单
 * @author 秦晓宇
 *
 */
@Controller
public class AddToOrderController {

	@Resource
	private AddCartToOrder addCartToOrder;
	
	@RequestMapping("addToOrder")
	public void addToOrder(HttpSession session,HttpServletResponse rs) {
		User u = (User)session.getAttribute("user");
		this.addCartToOrder.toOrder(u);
		try {
			rs.sendRedirect("index.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
