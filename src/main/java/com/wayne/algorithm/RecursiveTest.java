package com.wayne.algorithm;

public class RecursiveTest {

	public static void main(String[] args) {
		System.out.println(recursive(6));
	}
	
	public static int recursive(int n) {
		if(n <= 2) {
			return 1;
		}
		
		return recursive(n - 1) + recursive(n - 2);
	}
}
