package com.insertionsort;

/**
 * 
 * @author Chandra Mohan Singh
 *
 */
public class InsertionSortMain {
	public static void main(String[] args) {

		int array[] = { 12, 3, 3, 5, 6, 4, 3, 1, 2, 9, 7, 8 };

		InsertionSort insertionSort = new InsertionSort();
		System.out.println("Array Before Sorting : ");
		insertionSort.printArray(array);

		insertionSort.insertionSort(array);

		System.out.println("After sorting : ");
		insertionSort.printArray(array);
	}
}