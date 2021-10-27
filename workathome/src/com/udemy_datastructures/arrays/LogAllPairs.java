package com.udemy_datastructures.arrays;

public class LogAllPairs {

	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2, 4, 5 };

		findPair1(intArray);

	}

	public static void findPair1(int[] intArray) {
		//BruteForce O(n^2)
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				System.out.print(intArray[i] + "" + intArray[j] + ", ");
			}
		}
	}

}
