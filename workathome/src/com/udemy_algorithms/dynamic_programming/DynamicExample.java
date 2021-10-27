package com.udemy_algorithms.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class DynamicExample {
	
	public static void main(String args[]) {
		
		System.out.println(someLogic(4));
		System.out.println(someLogic(4));
		System.out.println(someLogic(2));
		
	}
	
	private static Map<Integer, Integer> cache = new HashMap<>();
	
	public static int someLogic(int input) {
		if(cache.containsKey(input)) {
			return cache.get(input);
		}
		System.out.println("Long process :");
		cache.put(input, 4 * input);
		return cache.get(input);
	}

}
