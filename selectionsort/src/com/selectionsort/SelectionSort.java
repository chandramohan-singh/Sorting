package com.selectionsort;

/**
 * 
 * @author Chandra Mohan Singh
 *
 */
public class SelectionSort {

	public void selectionSort(int[] a) {
		for (int j = 0; j < a.length; j++) {
			int minimumIndex = j;
			for (int i = j + 1; i < a.length; i++) {
				if (a[i] < a[minimumIndex]) // find which is the smallest element to right of 'j'
					minimumIndex = i;
			}
			if (minimumIndex != j) { // if j is not minimum index then swap
				int temp = a[j];
				a[j] = a[minimumIndex];
				a[minimumIndex] = temp;
			}
		}
	}

	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}
}