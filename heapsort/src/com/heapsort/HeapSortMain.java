package com.heapsort;

public class HeapSortMain {

	public static void main(String[] args) {

		int arr[] = { 10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8 };
		HeapSort heapSort = new HeapSort(arr);

		System.out.println("Array before sorting : ");
		heapSort.printArray();

		heapSort.sort();
		System.out.println("\nArray after sorting : ");
		heapSort.printArray();
	}
}