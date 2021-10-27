package com.udemy_datastructures.linkedlists;

public class MyLinkedList {
	
	Node head;
	int size = 1;
	
	public MyLinkedList(int data) {
		this.head = new Node(data);
	}
	
	public void addFromStart(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
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
		head = head.next;
		size--;
		temp.next = null;
		return temp;
	}
	
	public void print() {
		Node cur = head;
		System.out.print("HEAD -> ");
		while(cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.println("null");
	}
	
	public void addSorted(int data) { // Exercise question 2 - Self
		Node newNode = new Node(data);
		Node cur = head;
		
		if(data < cur.data) {
			newNode.next = head;
			head = newNode;
		} else {
			while(cur.next != null && data > cur.next.data) {			// 10 ... insert 20
				cur = cur.next;
			}
			newNode.next = cur.next;
			cur.next = newNode;
		}
	}
	
	public void reverse() {		//Exercise question 3 - Self						// 10 25 30 40 70
		Node prev = head;
		Node cur = prev.next;
		while(cur != null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		head.next = null;
		head = prev;
	}
	
	// FInd nth node from last using double pointer approach
	// 10 20 30 40 50 ---> find 2 returns 40
	public Node findFromLast(int n) {		
		Node cur1 = head;
		Node cur2 = head;
		
		int count = 0;
		// Move cur2 for n times from head
		// Now cur1 and cur2 are separated by n nodes
		while(cur2 != null && count < n) {
			cur2 = cur2.next;
			count++;
		}
		
		while(cur2 != null) {
			cur2 = cur2.next;
			cur1 = cur1.next;
		}
		
		return cur1;
	}
	
	public class Node{
		
		private int data;
		private Node next;
		
		private Node(int data){
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node data=" + data + "";
		}
		
	}

}
