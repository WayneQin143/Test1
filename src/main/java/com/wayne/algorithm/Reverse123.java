package com.wayne.algorithm;

import java.util.HashSet;

public class Reverse123 {

	public static void main(String[] args) {
		int num1 = 123, num2 = 0;
		int tmp = 100;
		while (num1 != 0) {
			num2 += num1 % 10 * tmp;
			num1 /= 10;
			tmp /= 10;
			System.out.println(num2 + "," + num1 + "," + tmp);
		}
		System.out.println(num2);
	}
}
