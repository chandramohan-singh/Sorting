package com.bubblesort;

public class BubbleSortMain {

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 10, 5, 35, 25, 50, 8 };
		bubbleSort.printArray(arr);

		bubbleSort.bubbleSort(arr);

		System.out.println("after Sorting Array is : ");
		bubbleSort.printArray(arr);
	}
}