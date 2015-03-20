package com.wayne.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void sort(Object[] a, int n) {
		if(n > a.length) {
			System.out.println("Invalid n");
			System.exit(1);
		}
		
		for(int i = 1; i < n; i++) {
			System.out.println(Arrays.toString(a));
			Object x = a[i];
			int j;
			for(j = i - 1; j >= 0; j--) {
				if(((Comparable)x).compareTo(a[j]) < 0) {
					a[j + 1] = a[j];
				} else {
					break;
				}
			}
			a[j + 1] = x;
		}
	}
	
	
	
	public static void main(String[] args) {
		Integer[] a = {43, 53, 18, 36, 72, 30, 48, 93, 15, 36};
		sort(a, 10);
	}
}
