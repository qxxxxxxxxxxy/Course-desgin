package com.jobulence.computer.util;

/**
 * 字符串数组转换成Integer数组
 * @author 秦晓宇
 *
 */
public class ArrayStringtoInteger {

	public static Integer[] arrayStringtoInteger(String a[]) {
		Integer [] ab = new Integer[a.length];
		for(int i = 0;i<a.length;i++) {
			ab[i] = Integer.parseInt(a[i]);
		}
		return ab;
	}
}
