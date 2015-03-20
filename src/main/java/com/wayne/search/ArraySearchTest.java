package com.wayne.search;

public class ArraySearchTest {

	public static void main(String[] args) {
		int[] a = new int[]{1, 5, 6, 7, 10, 13, 19, 25};
		int value = 5;
		int index = binarySearch(a, value);
		System.out.println(index);
//		System.arraycopy(src, srcPos, dest, destPos, length)
	}
	
	public static int search(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(value == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int value) {
		int low = 0;
		int high = array.length - 1;
		int middle;
		
		while(low <= high) {
			middle = (low + high) / 2;
			
			if(array[middle] == value) {
				return middle;
			}
			
			if(value < array[middle]) {
				high = middle - 1;
			}
			
			if(value > array[middle]) {
				low = middle + 1;
			}
		}
		
		return -1;
	}
	
}
