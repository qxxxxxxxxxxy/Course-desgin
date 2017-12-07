package com.jobulence.computer.product.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jobulence.computer.entity.Product;
import com.jobulence.computer.product.service.FindProductPageDivedeService;

@Controller
@RequestMapping("product")
public class FindProductPageDivideController {
	@Resource
	private FindProductPageDivedeService findProductService;

	@RequestMapping("/pageDivide")
	public void pageDivide(HttpServletResponse rs, @RequestParam("num") String a, 
			HttpSession session,@RequestParam("pageName") String name,HttpServletRequest rq) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		if(name.equals("beginning")) {
			ArrayList<Product> list = (ArrayList<Product>) this.findProductService.findAllProductPageDivideService(c);
			session.setAttribute("list", list);
			session.setAttribute("num", c);
			session.setAttribute("listName", name);
			try {
				rs.sendRedirect("../shop.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				rq.getRequestDispatcher(name).forward(rq, rs);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}

	@RequestMapping("/Computer")
	public void ComputerPageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService.findComputerProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/Phone")
	public void PhonePageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session ,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService.findPhoneProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/Tv")
	public void TvPageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService.findTvProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/Macbook")
	public void MacbookPageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService.findMacbookProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/AirConditoner")
	public void AirConditonerPageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService
				.findAirConditonerProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/Playstation")
	public void PlaystationPageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService
				.findPlayStationProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("/Ipad")
	public void IpadPageDivide(HttpServletResponse rs, @RequestParam("num") String a, HttpSession session,@RequestParam("pageName") String name) {
		int c = Integer.parseInt(a);
		if (c > 3) {
			c = 3;
		}
		if (c < 1) {
			c = 1;
		}
		ArrayList<Product> list = (ArrayList<Product>) this.findProductService.findIpadProductPageDivideService(c);
		session.setAttribute("list", list);
		session.setAttribute("num", c);
		session.setAttribute("listName", name);
		try {
			rs.sendRedirect("../shop.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
