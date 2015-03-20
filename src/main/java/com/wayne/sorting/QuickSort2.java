package com.wayne.sorting;

import java.util.Arrays;

public class QuickSort2 {
	
	public static void main(String[] args) {
		Integer[] a = {43, 53, 18, 36, 72, 30, 48, 93, 15, 36};
		System.out.println(Arrays.toString(a));
		QuickSort2.quickSort(a, 10);
	}
	
	public static int partition(Object a[], int s, int t) {
		int i = s, j = t;
		Object x = a[i++];
		while(i <= j) {
			System.out.println(Arrays.toString(a));
			while(i <= j && ((Comparable)a[i]).compareTo(x) <= 0){
				i++;
			}
			while(j >= i && ((Comparable)a[j]).compareTo(x) >= 0){
				j--;
			}
			if(i < j) {
				Object temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		a[s] = a[j];
		a[j] = x;
		return j;
	}
	
	public static void quickRecursion(Object a[], int s, int t) {
		int j = partition(a, s, t);
		System.out.println("---------- j: " + j + ", a[j]:" + a[j] + " ------------");
		if(s < j - 1) {
			quickRecursion(a, s, j - 1);
		}
		if(j + 1 < t) {
			quickRecursion(a, j + 1, t);
		}
	}
	
	public static void quickSort(Object a[], int n) {
		if (n > a.length){
			System.out.println("n is too large");
			System.exit(1);
		}
		quickRecursion(a, 0, n - 1);
	}
}
