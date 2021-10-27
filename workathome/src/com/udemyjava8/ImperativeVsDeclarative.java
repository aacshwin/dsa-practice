package com.udemyjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		// Print sum of number from 0 - 100

		// Imperative Approach : The HOW style of programming
		int sum1 = 0;
		for (int i = 0; i <= 100; i++) {
			sum1 += i;
		}
//		System.out.println("IA : " + sum1);

		// Declarative Approach : The WHAT style of programming
		int sum2 = IntStream.rangeClosed(0, 100).parallel().sum();
//		System.out.println("DA : " + sum2);

		List<String> strList = Arrays.asList("ed", "edd", "eddy");
//		strList.forEach(emp -> System.out.println(emp));
		
		Consumer<String> c1 = (emp) -> System.out.println(emp);
		Consumer<String> c2 = (emp) -> System.out.println(emp.toUpperCase());
//		strList.forEach(c1.andThen(c2));
//		
//		strList.forEach(emp -> {
//			c1.andThen(c2).accept(emp);
//		});
		
		strList.forEach(emp -> {
			c1.accept(emp);
		});
	}

}
