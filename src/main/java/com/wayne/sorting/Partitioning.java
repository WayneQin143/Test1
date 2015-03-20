package com.wayne.sorting;

import java.util.Arrays;

public class Partitioning {

	private static int[] theArray;

	private static int arraySize;

	public Partitioning(int newArraySize) {
		this.arraySize = newArraySize;
		theArray = new int[arraySize];
		generateRandomArray();
	}

	public void partitionArray(int pivot) {
		int leftPointer = -1;
		int rightPointer = arraySize;

		while (true) {
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
				break;
			} else {
				swapValues(leftPointer, rightPointer);
				System.out.println(theArray[leftPointer] + " was swapped for "
						+ theArray[rightPointer]);
			}
		}
	}

	public void swapValues(int indexOne, int indexTwo) {
		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;
	}

	public void generateRandomArray() {
		for(int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 50) + 10;
		}
	}

	public static void main(String[] args) {
		Partitioning partitionArray = new Partitioning(10);
		partitionArray.generateRandomArray();
		System.out.println(Arrays.toString(Partitioning.theArray));
		partitionArray.partitionArray(35);
		System.out.println(Arrays.toString(Partitioning.theArray));
	}

}
