package com.quicksort;

public class QuickSortMain {

	public static void main(String[] args) {
		
		int array[] = { 10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11 };
		
		QuickSort quickSort = new QuickSort();

		System.out.println("Array before sorting : ");
		quickSort.printArray(array);

		quickSort.quickSort(array, 0, array.length - 1);

		System.out.println("\nArray after sorting : ");
		quickSort.printArray(array);
	}
}