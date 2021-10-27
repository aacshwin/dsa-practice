package com.udemy_datastructures.queues;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyQueueWithLL {
	
	private static LinkedList<Integer> queue;
	private static int front;
	private static int last;
	
	public MyQueueWithLL() {
		this.queue = new LinkedList<>();
		this.front = 0;
		this.last = 0;
	}
	
	public void enqueue(Integer data) {
		queue.addLast(data);
		last++;
	}
	
	public void dequeue() {
		int dequeued = queue.getFirst();
		queue.removeFirst();
		System.out.println("dequeued : " + dequeued);
		front++;
	}
	
	public void peek() {
		System.out.println("peek : " + queue.getFirst());
	}
	
	public void print() {
		ListIterator iter = queue.listIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}

}
