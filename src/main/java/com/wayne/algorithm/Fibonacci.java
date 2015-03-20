package com.wayne.algorithm;

public class Fibonacci {

	/**
	 * 用递归的方式实现Fibonacci
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacciRecursive(int n) {
		if (n <= 2) {
			return 1;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	/**
	 * 用非递归的方式实现Fibonacci
	 * 
	 * @param n
	 * @return
	 */
	public int finonacciNormal(int n) {
		if (n <= 2) {
			return 1;
		}

		int a1 = 1;
		int a2 = 1;
		int an = 0;

		for (int i = 1; i < n; i++) {
			an = a1 + a2;
			a1 = a2;
			a2 = an;
		}

		return an;
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();

		System.out.println("fibonacciRecursive==="
				+ fibonacci.fibonacciRecursive(10));
//		System.out
//				.println("finonacciNormal===" + fibonacci.finonacciNormal(40));
	}
}
