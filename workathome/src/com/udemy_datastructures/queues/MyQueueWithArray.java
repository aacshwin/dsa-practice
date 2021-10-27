package com.udemy_datastructures.queues;

import java.util.Arrays;

public class MyQueueWithArray {
	
	private static int[] queue;
	private static int front;
	private static int last;
	
	public MyQueueWithArray() {
		this.queue = new int[5];
		this.front = 0;
		this.last = 0;
	}
	
	public void enqueue(int data) {
		if(last == queue.length) {
			this.queue = Arrays.copyOf(queue, queue.length * 2);
			
			// Alternative to resize an array
			//int newArray[] = new int[queue.length * 2];
			//System.arraycopy(queue, front, newArray, 0, queue.length);
			
		}
		queue[last] = data;
		last++;
	}
	
	public void deqeue() {
		int dequed = queue[front];
		queue[front] = 0;
		System.out.println("deqeued : "  + dequed);
		front++;
	}
	
	public void peek() {
		int peek = queue[front];
		System.out.println("Peek : "  + peek);
	}
	
	public void print() {
		for(int i = front; i < last; i++) {
			System.out.print(queue[i] + " ");
		}
	}

}
