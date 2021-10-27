package com.udemy_datastructures.arrays;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		
		//O(n) - Self

		String inputStr = "Hello World!";

		String[] strArray = inputStr.split("");

		for (int i = 0; i < strArray.length / 2; i++) {
			String temp = strArray[i];
			strArray[i] = strArray[strArray.length - 1 - i];
			strArray[strArray.length - 1 - i] = temp;
		}

		String outputStr = Arrays.toString(strArray);
		
		int[] intArr = new int[] {1, 2, 8, 4, 5};
		
		reverseArray(intArr);

//		System.out.println(outputStr);

	}

	public static String reverseString2(String string) {
		String result = ""; // It's more recommended to use "StringBuilder" object when manipulating strings
		final int length = string.length();
		for (int i = length - 1; i >= 0; i--) {
			result += string.charAt(i);
		}
		return result;
	}

	public static String reverseString3(String string) {
		return new StringBuilder(string).reverse().toString();
	}
	
	public static void reverseArray(int[] intArr) {
		
		for (int i = 0; i < intArr.length / 2; i++) {
			int temp = intArr[i];
			intArr[i] = intArr[intArr.length - 1 - i];
			intArr[intArr.length - 1 - i] = temp;
		}
		
	}

}
