package com.selectionsort;

public class SelectionSortMain {

	public static void main(String[] args) {
		int array[] = { 11, 3, 4, 5, 8, 4, 3, 1, 3, 9, 7, 8 };
		
		SelectionSort selectionSort = new SelectionSort();
		
		System.out.print("Before selection sort : ");
		selectionSort.printArray(array);

		selectionSort.selectionSort(array);

		System.out.print("\nAfter selection sort : ");
		selectionSort.printArray(array);
	}
}