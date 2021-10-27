package com.udemy_datastructures.linkedlists;

import com.udemy_datastructures.linkedlists.MyDoublyLinkedList.Node;

public class MyDoublyLinkedList {

	Node head;
	Node tail;
	int size = 1;

	public MyDoublyLinkedList(int data) {
		this.head = new Node(data);
		this.tail = this.head;
	}

	public void addFromStart(int data) {
		Node node = new Node(data);
		node.next = head;
		head.previous = node;
		head = node;
		size++;
	}
	
	public void addToEnd(int data) {
		Node node = new Node(data);
		node.previous = tail;
		tail.next = node;
		tail = node;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null ? true : false;
	}

	public Node deleteFromStart() {
		Node temp = head;
		head.next.previous = head.previous;   //null
		head = head.next;
		size--;
		temp.next = null;
		return temp;
	}
	
	public Node deleteFromEnd() {
		Node temp = tail;
		temp.previous.next = temp.next;
		tail = tail.previous;
		size--;
		temp.previous = null;
		return temp;
	}

	public void printfromHead() {
		Node cur = head;
		System.out.print("HEAD -> ");
		while (cur != null) {
			System.out.print(cur.data + " <-> ");
			cur = cur.next;
		}
		System.out.println("null");
	}
	
	public void addBefore(int newNodeData, int existingNodeData) {  // Exercise question 1 - Self
		Node cur = head;
		Node newNode = new Node(newNodeData);
		
		while(cur != null) {
			cur = cur.next;
			if(cur.data == existingNodeData) {
				newNode.next = cur.previous.next;
				newNode.previous = cur.previous;
				cur.previous.next = newNode;
				cur.previous = newNode;
				return;
			}
		}
		
		
	}

	public class Node {

		private int data;
		private Node next;
		private Node previous;

		private Node(int data) {
			this.data = data;
		}
	}

}
