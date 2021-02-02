package com.mergesort;

/**
 * 
 * @author Chandra Mohan Singh
 *
 */
public class MergeSortMain {

	public static void main(String[] args) {

		int array[] = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };

		MergeSort mergeSort = new MergeSort();
		System.out.println("Array before sorting : ");
		mergeSort.printArray(array);

		mergeSort.mergeSort(array, 0, array.length - 1);

		System.out.println("\nArray After sorting : ");
		mergeSort.printArray(array);
	}
}