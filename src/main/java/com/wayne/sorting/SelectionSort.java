package com.wayne.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void sort(Object[] a, int n) {
		if(n > a.length) {
			System.out.println("Invalid n");
			System.exit(1);
		}
		
		for(int i = 1; i < n; i++) {
			System.out.println("---------------------------------------");
			System.out.println(Arrays.toString(a));
			for(int j = i; j <= n - 1; j++) {
				int k = i - 1;
//				System.out.println(Arrays.toString(a));
				if(((Comparable)a[j]).compareTo(a[k]) < 0){ 
					k = j;
				}
				if(k != i - 1) {
					Object x = a[i - 1];
					a[i - 1] = a[k];
					a[k] = x;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {43, 53, 18, 36, 72, 30, 48, 93, 15, 36};
		sort(a, 10);
		System.out.println(Arrays.toString(a));
	}
}
