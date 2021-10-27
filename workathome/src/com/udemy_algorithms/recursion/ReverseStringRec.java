package com.udemy_algorithms.recursion;

public class ReverseStringRec {
	
	private static String output = "";
	
	public static void main(String[] args) {
		
		String inputString = "hello";
		System.out.println(reverse(inputString));
		
	}
	
	public static String reverseIterative(String input) {
		String output = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	
	
	public static String reverse(String input) {
		if (input.equals("")) {
			return "";
		}
		return reverse(input.substring(1)) + input.charAt(0);
	}
	
}
