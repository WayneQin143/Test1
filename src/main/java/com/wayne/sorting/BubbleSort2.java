package com.wayne.sorting;

public class BubbleSort2 {

	public static void main(String[] args) {
		int[] array = {8, 5, 1, 11, 7, 22, 3};
		bubbleSort(array);
		for(int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
	
	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
}
