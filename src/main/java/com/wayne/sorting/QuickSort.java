package com.wayne.sorting;

import java.util.Arrays;

public class QuickSort {

	private static int[] theArray;

	private static int arraySize;

	public static void main(String[] args) {
		QuickSort theSort = new QuickSort(10);
		theSort.generateRandomArray();
		System.out.println(Arrays.toString(QuickSort.theArray));
		theSort.quickSort(0, 9);
		System.out.println(Arrays.toString(QuickSort.theArray));
	}
	
	
	QuickSort(int newArraySize) {
		this.arraySize = newArraySize;
		theArray = new int[arraySize];
		generateRandomArray();
	}

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 50) + 10;
		}
	}

	public void quickSort(int left, int right) {
		if (right - left <= 0) {
			return;
		} else {
			int pivot = theArray[right];
			System.out.println("Value in right " + theArray[right]
					+ " is made the pivot ");
			System.out.println("left=" + left + ", right=" + right + ", pivot="
					+ pivot + " sent to be partitioned");
			int pivotLocation = partitionArray(left, right, pivot);
			System.out.println("Value in left " + theArray[left]
					+ " is made the pivot ");
			
			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);

		}
	}

	public int partitionArray(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;
		
		while(true) {
			while (leftPointer < (arraySize - 1)
					&& theArray[++leftPointer] < pivot) {
				;
			}

			System.out.println(theArray[leftPointer] + " in index "
					+ leftPointer + " is bigger then the pivot value " + pivot);

			while (rightPointer > 0 && theArray[--rightPointer] > pivot) {
				;
			}

			System.out.println(theArray[rightPointer] + " in index "
					+ rightPointer + " is smaller then the pivot value "
					+ pivot);

			if (leftPointer >= rightPointer) {
				System.out.println("left is >= right so start again");
				System.out.println("-----------------------------------------");
				System.out.println(Arrays.toString(theArray));
				break;
			} else {
				swapValues(leftPointer, rightPointer);
				System.out.println(theArray[leftPointer] + " was swapped for "
						+ theArray[rightPointer]);
				System.out.println(Arrays.toString(theArray));
			}
		}
		swapValues(leftPointer, right);
		return leftPointer;
	}
	
	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}
}
