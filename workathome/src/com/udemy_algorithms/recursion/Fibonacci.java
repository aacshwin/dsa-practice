package com.udemy_algorithms.recursion;

public class Fibonacci {
	
	public static void main(String[] args) {
		int input = 70;		//0, 1, 1, 2, 3, 5, 8, 13, 21...
		
//		System.out.println(factorialWithLoops(input));
		System.out.println(fibonacci(input));
		
	}
	
	public static int factorialWithLoops(int input) {	//O(n) Linear
		int[] arr = new int[input + 1];
		arr[0] = 0;
		arr[1] = 1;
		for(int i = 2; i < input + 1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[input];
	}
	
	public static int fibonacci(int input) {	//O(2^n) Exponential
		if(input < 2) {
			return input;
		}
		return fibonacci(input -1) + fibonacci(input - 2);
	}

}
