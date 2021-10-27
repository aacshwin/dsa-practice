package com.udemy_algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 5, 6, 8, 3, 10, 4};
		
		for(int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for(int j = i+1; j< arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
