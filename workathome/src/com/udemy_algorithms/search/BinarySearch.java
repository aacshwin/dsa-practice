package com.udemy_algorithms.search;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] input = new int[] {2, 4, 8, 10, 16, 18, 20};
		System.out.println(search(input, 0, input.length -1, 5));
		
	}
	
	public static int search(int[] input, int l, int r, int target) {
		if(l < r) {
			int m = (l + r)/2;
			if(input[m] == target) {
				return target;
			} 
			if(input[m] > target) {
				return search(input, l, m, target);
			} else { //if(input[m] < target) 
				return search(input, m + 1, r, target);
			}
		}
		return -1;
	}
	
	public static int searchIterative(int[] input, int l, int r, int target) {
		while(l < r) {
			int m = (l + r)/2;
			if(input[m] == target) {
				return target;
			} 
			if(input[m] > target) {
				r = m;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}
	
}
