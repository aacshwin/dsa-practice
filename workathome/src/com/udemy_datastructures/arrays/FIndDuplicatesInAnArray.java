package com.udemy_datastructures.arrays;

import java.util.ArrayList;
import java.util.List;

public class FIndDuplicatesInAnArray {
	
	public static void main(String[] args) {
		int[] a = new int[] {4, 3, 2, 7, 8, 2, 3, 1};		
							// -3 -2 -7       -3 -1         
		
		System.out.println(findDuplicate1(a));
	}
	
	public static List<Integer> findDuplicate1(int[] input) {
		List<Integer> output = new ArrayList<>();
		for(int i = 0; i< input.length; i++) {
			int index = Math.abs(input[i]);
			if(input[index - 1] > 0) {
				input[index - 1] =  input[index - 1] * (-1);
			} else {
				output.add(Math.abs(input[i]));
			}
		}
		return output;
	}

}
