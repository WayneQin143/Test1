package com.wayne.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//自然数序列，找出任意连续之和等于n的所有子序列  
public class FindConsecutiveNum {

	public static void main(String[] args) {
		int[] array = {0,2,4,5,3,1,8,6,4,7,9,3,2};
		int sum = 9;
		
		find(array, sum);
	}
	
	//Time complexity: ..
	public static void find(int[] array, int sum) {
		
		System.out.println(Arrays.toString(array));
		
		List<Integer> subArray = new ArrayList<Integer>();
		int subSum = 0;
		
		for(int i = 0; i < array.length; i++) {
			subArray.add(array[i]);
			subSum = subSum + array[i];
			
			System.out.println(subArray + "," + subSum);
			
			if(subSum == sum){
				System.out.println(subArray + "--------------------------ok");
				continue;
			}
			
			if(subSum < sum) {
				continue;
			}
			
			if(subSum > sum) {
				for(int j = 0; j < subArray.size(); j++) {
					int firstSubNum = subArray.remove(0);
					subSum = subSum - firstSubNum;
					if(subSum < sum) {
						break;
					}
					if(subSum == sum) {
						System.out.println(subArray + "--------------------------ok");
					}
				}
			}
		}
	}
}
