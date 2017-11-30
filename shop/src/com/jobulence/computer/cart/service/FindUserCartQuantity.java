package com.jobulence.computer.cart.service;

import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobulence.computer.entity.Cart;
import com.jobulence.computer.entity.User;

@Service
@Transactional()
public class FindUserCartQuantity {

	public int find(User u) {
		int a = 0;
		Set<Cart> st = u.getCart();
		for (Cart cart : st) {
			a = a + cart.getCount();
		}
		return a;
	}
}
