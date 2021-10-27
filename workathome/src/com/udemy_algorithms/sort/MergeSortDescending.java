package com.udemy_algorithms.sort;

import java.util.Arrays;

public class MergeSortDescending {
	
	public static void main(String[] args) {

		int[] arr = new int[] { -22, 5, 6, -4, 1, -10, 8, 12 };

		// Initially l = 0; r = n -1
		split(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void split(int[] input, int l, int r) {
		if(l < r) { // to recursively split until we have single element arrays
			//Find mid
			int m = (l + r)/2;
			
			//Split left sub array
			split(input, l, m);
			//Split right sub array
			split(input, m+1, r);
			
			//Merge sorted sub array
			merge(input, l, m, r);
			
			
			//0, 7, 3
			//0, 3, 1
			//0, 1, 0 --> l < r(0 < 0) becomes false; goes to next statement 2
			//0, 1, 0 --> still l < r(1 < 1) becomes false; goes to next statement 3 i.e. merge. after merge this call pops
			//0, 3, 1 to statement 2
			
		}
	}
	
	public static void merge(int[] input, int l, int m, int r) {
		//Find lengths of sub arrays
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//Define sub arrays
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//Copy input to sub arrays
		for(int i = 0; i < n1; i++) {
			left[i] = input[i + l];
		}
		for(int j = 0; j < n1; j++) {
			right[j] = input[j + m + 1];
		}
		
		//Merge to original array in sorted order
		
		//Initial index of merged sub array
		int k = l;
		
		//Initialize the sub array indices to 0
		int i = 0, j = 0;
		
		while(i < n1 && j < n2) {
			if(left[i] >= right[j]) {
				input[k] = left[i];
				k++;
				i++;
			} else {
				input[k] = right[j];
				k++;
				j++;
			}
		}
		
		//Merge remaining items if any
		while(i < n1) {
			input[k] = left[i];
			k++;
			i++;
		}
		
		while(j < n2) {
			input[k] = right[j];
			k++;
			j++;
		}
		
	}

}
