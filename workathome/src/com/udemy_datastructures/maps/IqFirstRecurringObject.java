package com.udemy_datastructures.maps;

import java.util.HashMap;
import java.util.Map;

public class IqFirstRecurringObject {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 2, 5, 1, 3, 5, 1, 2, 4 }; // Should return 5

		System.out.println(recurFirst1(inputArray));

	}

	public static int recurFirst1(int[] inputArray) {
		// O(n) - Self
		Map<Integer, Boolean> inputMap = new HashMap<>(); // Also can be done with just list

//		for (int i = 0; i < inputArray.length; i++) {
//			inputMap.put(inputArray[i], false);
//		}

		for (int i = 0; i < inputArray.length; i++) {
			if (inputMap.containsKey(inputArray[i]) && // If list, just use contains.
					inputMap.get(inputArray[i]) == true) {
				return inputArray[i];
			}
			inputMap.put(inputArray[i], true);
		}
		return -1;
	}

	public static int recurFirst2(int[] inputArray) {
		// O(n^2)
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					return inputArray[i];
				}
			}
		}
		return -1;
	}

}
