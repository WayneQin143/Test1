package com.wayne.algorithm;

import java.util.Arrays;

//一个排好序的数组，找出两数之和为m的所有组合  
public class FindTheSum {

	public static void main(String[] args) {
		//findSum1
		int[] array = {3, 7, 17, 4, 6, 5, 14};
//		findSum1(array, 20);
		
		//findSum2
		findSum2(array, 20);
	}
	
	
	//Time complexity: O(n2)
	public static void findSum1(int[] a, int sum) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i; j < a.length; j++) {
				if(a[i] + a[j] == sum) {
					System.out.println(a[i] + "," + a[j]);
				}
			}
		}
	}
	
	//Time complexity: O(n)
	public static void findSum2(int[] a, int sum) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int begin = 0;
		int end = a.length - 1;
		
		if(a[begin] > sum) {
			System.out.println("No such data");
			return;
		}
		
		while(begin < end) {
			
			if(a[begin] + a[end] < sum) {
				begin++;
				continue;
			} 

			if(a[begin] + a[end] > sum) {
				end--;
				continue;
			} 
			
			if(a[begin] + a[end] == sum) {
				System.out.println(a[begin] + "," + a[end]);
				begin++;
				end--;
			}
		}
	}
}
