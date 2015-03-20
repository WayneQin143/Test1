package com.wayne.algorithm;

public class FindMissingNumber {

	public static int solution(int[] A) {
		long N = A.length + 1;
        long total = N * (N + 1) / 2;

        for (int i = 0; i < A.length; i++) {
            total -= A[i];
        }

        return (int)total;
	}
	
	public static int solution2(int[] A) {
		long N = A.length + 1;
		long total = N * (N + 1) / 2;
		
		long sum = 0;
		for(int i = 0; i < A.length; i++) {
			sum += A[i];
		}
		
		return (int) (total - sum);
	}
	
	public static void main(String[] args) {
		int[] A = {2, 4, 1, 5};
		long result = FindMissingNumber.solution(A);
		System.out.println(result);
	}
}
