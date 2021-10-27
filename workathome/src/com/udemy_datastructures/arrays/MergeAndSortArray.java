package com.udemy_datastructures.arrays;

import java.util.Arrays;

public class MergeAndSortArray {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 4, 6, 22 };
		int[] array2 = new int[] {2, 5, 10};

		mergeArray1(array1, array2);

	}

	public static void mergeArray1(int[] array1, int[] array2) {
		// O(n)
		int[] output = new int[array1.length + array2.length];

		int i = 0;
		int j = 0;

		for (int k = 0; k < output.length; k++) {
			if (i < array1.length && (j == array2.length || array1[i] < array2[j])) {
				output[k] = array1[i];
				i++;
			} else {
				output[k] = array2[j];
				j++;
			}
		}
		
		System.out.println("Merged Output : " + Arrays.toString(output));

	}

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		//O(n1 + n2) - GeekforGeeks - Preferred method
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < n1 && j < n2) {
			// Check if current element of first
			// array is smaller than current element
			// of second array. If yes, store first
			// array element and increment first array
			// index. Otherwise do same with second array
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}

		// Store remaining elements of first array
		while (i < n1)
			arr3[k++] = arr1[i++];

		// Store remaining elements of second array
		while (j < n2)
			arr3[k++] = arr2[j++];
	}

}
