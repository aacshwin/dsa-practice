package com.udemy_datastructures.stacks;

import java.util.Arrays;

public class MyStackWithArray {
	
	private int[] stack;
	private int top;
	
	public MyStackWithArray() {
		this.stack = new int[5];
		this.top = 0;
	}
	
	public void push(int data) {
		if(top == stack.length) {
			this.stack = Arrays.copyOf(stack, stack.length + 5);
		}
		stack[top] = data;
		top++;
	}
	
	public void pop() {
		int popped = stack[top-1];
		stack[top-1] = 0;
		top--;
		System.out.println("Popped : " + popped);
	}
	
	public void peek() {
		System.out.println("Peek : " + stack[top-1]);
	}
	
	public void print() {
		System.out.println("The contents of the stack: ");
		for(int i = 0; i < top; i++) {
			System.out.println(stack[i]);
		}
	}

}
