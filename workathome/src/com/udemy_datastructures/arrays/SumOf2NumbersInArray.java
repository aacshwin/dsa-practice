package com.udemy_datastructures.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOf2NumbersInArray {
	
	public static void main(String[] args) {
		int[] intArray = new int[] {2, 4, 5, 7, 9}; // if sum = 12 return true else false
		int sum = 12;
		
		boolean output = testArray2(intArray, sum);
		
		System.out.println(output);
	}
	
	public static boolean testArray1(int[] test, int sum) {
		//O(n^2)
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test.length; j++) {
				if(test[i] + test[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean testArray2(int[] test, int sum) {
		//O(n)
		List<Integer> compList = new ArrayList<>();
				
		for(int i = 0; i < test.length; i++) {
			if(compList.contains(test[i])) {
				return true;
			}
			compList.add(sum - test[i]);
		}
		return false;
	}
	
	public static boolean testArray3(int[] test, int sum) {
		//O(n + n)
		List<Integer> compList = new ArrayList<>();
		for(int i = 0; i < test.length; i++) {
			compList.add(sum - test[i]);
		}
		
		for(int i = 0; i < test.length; i++) {
			if(compList.contains(test[i])) {
				return true;
			}
		}

		return false;
	}

}
