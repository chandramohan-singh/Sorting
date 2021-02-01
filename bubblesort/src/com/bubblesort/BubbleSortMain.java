package com.bubblesort;

/**
 * 
 * @author Chandra Mohan Singh
 *
 */
public class BubbleSortMain {

	public static void main(String[] args) {

		BubbleSort bubbleSort = new BubbleSort();
		int arr[] = { 11, 5, 35, 15, 60, 6 };
		System.out.print("Array before bubble sort : ");
		bubbleSort.printArray(arr);
		bubbleSort.bubbleSort(arr);
		System.out.print("\nArray after bubble sort : ");
		bubbleSort.printArray(arr);
	}
}