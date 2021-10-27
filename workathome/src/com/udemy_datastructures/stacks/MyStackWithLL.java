package com.udemy_datastructures.stacks;

import java.util.Iterator;
import java.util.LinkedList;

public class MyStackWithLL {
	
	private static Integer top = 0;
	private static LinkedList<Integer> stackLL = new LinkedList<>();
	
	public void push(Integer data) {
		stackLL.addFirst(data);
		top++;
	}
	
	public void pop() {
		int popped = stackLL.removeFirst();
		System.out.println("Popped : " + popped);
		top--;
	}
	
	public void peek() {
		System.out.println(stackLL.getFirst());
	}
	
	public void size() {
		System.out.println("The size is :" + top);
	}
	
	public void print() {
		Iterator<Integer> iter = stackLL.iterator();
		System.out.println("The contents of the stack :");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	

}
