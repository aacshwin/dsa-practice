package com.udemy_algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 5, 6, 8, 4, 10, 1};
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = 0; j< arr.length -1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
