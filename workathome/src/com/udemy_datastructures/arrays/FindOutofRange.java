package com.udemy_datastructures.arrays;

public class FindOutofRange {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 12, 11, 15};
		int low = 10;
		int high = 15;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > high || arr[i] < low) {
				System.out.println(arr[i]);
			}
		}
		
		
		
	}

}
