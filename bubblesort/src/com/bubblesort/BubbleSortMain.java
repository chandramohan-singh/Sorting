package com.bubblesort;

public class BubbleSortMain {

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 11, 5, 35, 15, 60, 6 };
		bubbleSort.printArray(arr);
		bubbleSort.bubbleSort(arr);
		System.out.println("Array after bubble sort : ");
		bubbleSort.printArray(arr);
	}
}