package com.heapsort;

public class HeapSort {
	int[] arr = null;

	public HeapSort(int[] arr) {
		this.arr = arr;
	}
	
	public void sort() {
		BinaryHeap binaryHeap = new BinaryHeap(arr.length);
		for (int i = 0; i < arr.length; i++) {
			binaryHeap.insertInBinaryHeap(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) { // Extract from Binary Heap and insert sorted data in current Array
			arr[i] = binaryHeap.extractHeadOfBinaryHeap();
		}
	}

	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}