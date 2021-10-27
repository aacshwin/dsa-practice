package com.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	
	public static void main(String[] args) {
		
		List<Integer> intArray = new ArrayList<>();
		intArray.add(234);
		intArray.add(345);
		intArray.add(657);
		intArray.add(860);
		
		// Sort based on lsb
		
		// Using Anonymous class for interface :
		Comparator<Integer> c1 = new Comparator<>() {
			public int compare(Integer i, Integer j) {
				return i%10 > j%10 ? 1 : -1;
			}
		};
		
		// Or using Lambda :
		Comparator<Integer> c2 = (i, j) -> i%10 > j%10 ? 1 : -1;
		
		Collections.sort(intArray, c2);
		for(Integer v : intArray) {
			System.out.println(v);
		}
		
	}

}
