package com.udemy_datastructures.queues;

import java.util.Stack;

public class MyQueueWithStack {
	
	private static int front;
	private static int last;
	private static Stack<Integer> queueStack;
	private static Stack<Integer> tempQueueStack;
	
	public MyQueueWithStack() {
		this.queueStack = new Stack<>();
		this.tempQueueStack = new Stack<>();
		this.front = 0;
		this.last = 0;
	}
	
	public void enqueue(Integer data) {
		
		// popping all s1 into s2. Thus all s2 will be in orginal order.
		while(!queueStack.isEmpty()) {
			tempQueueStack.push(queueStack.pop());
		}
		// new data added to s1
		queueStack.push(data);
		
		//Now pop back all of s2 into s1. Now s1 will be in reversed order.
		while(!tempQueueStack.isEmpty()) {
			queueStack.push(tempQueueStack.pop());
		}
	}
	
	public void dequeue() {
		System.out.println("Popped : " + queueStack.pop());
	}
	
	public void peek() {
		System.out.println("Peek : " + queueStack.peek());
	}
	
	public boolean isEmpty() {
		if(queueStack.empty()) return true;
		return false;
	}
	
	public void print() {
		Stack<Integer> tempQueueStack = new Stack<>();
		tempQueueStack = queueStack;
		while(!tempQueueStack.isEmpty()) {
			System.out.println(tempQueueStack.pop());
		}
	}

}
