package com.udemy_datastructures.maps;

public class HashingFunction {
	
	private static Integer[] mapArray = new Integer[10];
	
	public static void main(String[] args) {
		
		Integer[] input = new Integer[] {12312, 20, 4564, 4, 224, 0};
		
		for(int i = 0; i < input.length; i++) {
			mapArray[hash(input[i])] = input[i];
		}
		
		for(int i = 0; i < mapArray.length; i++) {
			System.out.println(mapArray[i]);
		}
		
	}
	
	public static int hash(Integer num) {
		int out = mapArray.length;
		return out;
	}

}
