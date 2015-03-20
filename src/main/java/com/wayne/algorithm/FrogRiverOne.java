package com.wayne.algorithm;

import java.util.concurrent.Semaphore;

public class FrogRiverOne {

	public static int solution(int X, int[] A) {
		int steps = X;
		boolean[] bitmap = new boolean[steps + 1];
		for(int i = 0; i < A.length; i++) {
			if(!bitmap[A[i]]) {
				bitmap[A[i]] = true;
				steps--;
			}
			if(steps == 0) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		System.out.println(FrogRiverOne.solution(5, A));
		
		Semaphore semphore = new Semaphore(100);
	}
}
