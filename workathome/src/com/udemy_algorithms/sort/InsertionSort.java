package com.udemy_algorithms.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 5, 6, 4, 1, 10, 4};
		
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && key < arr[j]) {
				//swap
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
