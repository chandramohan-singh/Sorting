package com.heapsort;

public class BinaryHeap {
	int[] arr;
	int sizeOfTree;

	/**
	 * Adding 1 here so that first cell of the array can be left blank all the time.
	 * This is to eliminate problem of array starting from index 0.
	 */
	public BinaryHeap(int size) {
		arr = new int[size + 1];
		this.sizeOfTree = 0;
	}

	// Insert a new value in Binary Heap
	public void insertInBinaryHeap(int value) {
		arr[sizeOfTree + 1] = value;
		sizeOfTree++;
		HeapifyBottomToTop(sizeOfTree);
	}

	// Extract Head of Heap
	public int extractHeadOfBinaryHeap() {
		if (sizeOfTree == 0) {
			return -1;
		} else {
			int extractedValue = arr[1];
			arr[1] = arr[sizeOfTree];
			sizeOfTree--;
			HeapifyTopToBottom(1);
			return extractedValue;
		}
	}

	public void HeapifyBottomToTop(int index) {
		int parent = index / 2;
		// We are at root of the tree. Hence no more Heapifying is required.
		if (index <= 1) {
			return;
		}
		// If Current value is smaller than its parent, then we need to swap
		if (arr[index] < arr[parent]) {
			int tmp = arr[index];
			arr[index] = arr[parent];
			arr[parent] = tmp;
		}
		HeapifyBottomToTop(parent);
	}

	public void HeapifyTopToBottom(int index) {
		int left = index * 2;
		int right = (index * 2) + 1;
		int smallestChild = 0;

		// If there is no child of this node, then nothing to do. Just return.
		if (sizeOfTree < left) {
			return;
			// If there is only left child of this node, then do a comparison and return.
		} else if (sizeOfTree == left) {
			if (arr[index] > arr[left]) {
				int tmp = arr[index];
				arr[index] = arr[left];
				arr[left] = tmp;
			}
			return;
		} else { // If both children are there
			if (arr[left] < arr[right]) { // Find out the smallest child
				smallestChild = left;
			} else {
				smallestChild = right;
			}
			// If Parent is greater than smallest child, then swap
			if (arr[index] > arr[smallestChild]) {
				int tmp = arr[index];
				arr[index] = arr[smallestChild];
				arr[smallestChild] = tmp;
			}
		}
		HeapifyTopToBottom(smallestChild);
	}

	public void printBinaryHeap() {
		// Printing from 1 because 0th cell is dummy
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

}
