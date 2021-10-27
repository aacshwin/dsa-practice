package com.random;

import java.util.Arrays;
import java.util.List;

class A {
	void method1() {
		System.out.println("A : method 1");
	}
}

class B extends A{
	void method2() {
		System.out.println("B : method 2");
	}

	void method3() {
		System.out.println("B : method 3");
	}
}

public class Random1 {
	
	public static void main(String[] args) {
		B obj = new B();
		obj.method1();
		
		List<Character> str = Arrays.asList('a','b',' ',' ', ' ','s');
		
		System.out.println(str.size());
	}
}
