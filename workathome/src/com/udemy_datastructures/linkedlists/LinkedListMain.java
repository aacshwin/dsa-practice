package com.udemy_datastructures.linkedlists;

public class LinkedListMain {
	
	public static void main(String[] args) {
		
		
		MyLinkedList ll1 = new MyLinkedList(10);
		ll1.addSorted(30);
		ll1.addSorted(70);
//		ll1.deleteFromStart();
		
//		ll1.print();
		
		ll1.addSorted(40);
		ll1.addSorted(25);
//		ll1.print();
//		ll1.reverse();
		ll1.print();
		System.out.println(ll1.findFromLast(1));
//		System.out.println("SIze of the LL is : " + ll1.size());
		
		MyDoublyLinkedList ll2 = new MyDoublyLinkedList(10);
		ll2.addFromStart(20);
		ll2.addFromStart(30);
		ll2.addFromStart(40);
		
		ll2.addToEnd(50);
		ll2.addToEnd(60);
		ll2.addToEnd(70);
		
		ll2.deleteFromEnd();
		ll2.deleteFromStart();
		
//		ll2.printfromHead();
		ll2.addBefore(40, 50);
//		ll2.printfromHead();
//		System.out.println("SIze of the LL is : " + ll2.size());
	}

}
