package com.udemy_algorithms.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class DynamicFibonacci {

	public static void main(String[] args) {

		System.out.println(recursiveFibonacci(35));
		System.out.println(calc);
	}

	private static Map<Integer, Integer> cache = new HashMap<>();
	private static int calc = 0;
		
	public static int recursiveFibonacci(int input) {
		calc++;
		if (input < 2) {
			return input;
		}
		if (cache.containsKey(input)) {
			return cache.get(input);
		} else {
			cache.put(input, recursiveFibonacci(input - 1) + recursiveFibonacci(input - 2));
			return cache.get(input);
		}
	}

}
