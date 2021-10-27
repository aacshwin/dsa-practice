package com.udemy_algorithms.recursion;

public class Factorial {
	
	public static void main(String[] args) {
		int input = 5;
//		factorialWithLoop(input);
		System.out.println(factorial(input));
		
	}
	
	public static void factorialWithLoop(int input) {
		//O(n)
		int output = 1;
		for (int i = input; i > 1; i--) {
			output *= i;
		}
		System.out.println(output);
	}
	
	public static int factorial(int input) {
		//O(n)
		if(input == 0) {
			return 1;
		}
//		output *= input;
//		input--;
		return input * factorial(input - 1);
	}

}
