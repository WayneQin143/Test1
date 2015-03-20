package com.wayne.algorithm;

public class PermCheck {
	public static int solution(int[] A) {
		int[] counter = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			if (A[i] < 1 || A[i] > A.length) {
				// Out of range
				return 0;
			} else if (counter[A[i] - 1] == 1) {
				// met before
				return 0;
			} else {
				// first time meet
				counter[A[i] - 1] = 1;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int[] A = {4, 1, 3, 2};
		int[] B = {4, 1, 3};
		
		System.out.println(PermCheck.solution(A));
		System.out.println(PermCheck.solution(B));
	}
}
