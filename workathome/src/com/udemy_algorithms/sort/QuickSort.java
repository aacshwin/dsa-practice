package com.udemy_algorithms.sort;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {

		int[] arr = new int[] { 22, 5, 6, 4, 1, 10, 8, 12 };

		// Initially l = 0; r = n - 1
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int l, int r) {
		if(l < r) {
			int pi = partition(arr, l, r);
			quickSort(arr, l, pi - 1);
			quickSort(arr, pi + 1, r);
		}
		
	}

	private static int partition(int[] arr, int l, int r) {
		int pi = l;
		int pivot = r;
		
		for(int i = l; i < r; i++) {
			if(arr[i] < arr[pivot]) {
				swap(arr, i, pi);
				pi++;
			}
		}
		swap(arr, pi, r);
		return pi;
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
