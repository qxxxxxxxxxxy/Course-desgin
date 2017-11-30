package com.jobulence.computer.util;

public class ArrayStringtoInteger {

	public static Integer[] arrayStringtoInteger(String a[]) {
		Integer [] ab = new Integer[a.length];
		for(int i = 0;i<a.length;i++) {
			ab[i] = Integer.parseInt(a[i]);
		}
		return ab;
	}
}
