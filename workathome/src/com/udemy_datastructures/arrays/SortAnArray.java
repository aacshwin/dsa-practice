package com.udemy_datastructures.arrays;

import java.util.Arrays;

public class SortAnArray {
	
	public static void main(String[] args) {
		//O(n^n) Descending
		
		int[] inputArray = new int[] {12, 82, 48, 54, 2, 40};
		
		int[] sortedArtay = Arrays.copyOf(inputArray, inputArray.length);
		
		for(int i = 0; i < sortedArtay.length; i++) {
			for(int j = i+1; j < sortedArtay.length; j++) {
				if(sortedArtay[i] < sortedArtay[j]) {
					int swap = sortedArtay[i];
					sortedArtay[i] = sortedArtay[j];
					sortedArtay[j] = swap;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(sortedArtay));
		
	}

}
