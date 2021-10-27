package com.udemy_datastructures.trees;

public class TreeMain {
	
	public static void main(String[] args) {
		MyTree tree1 = new MyTree();
		tree1.insert(25);
		tree1.insert(22);
		tree1.insert(28);
		tree1.insert(24);
		tree1.insert(14);
		tree1.insert(26);
		tree1.insert(34);

		
		//				25
		//			22		28
		//		14		2426	34

		
		tree1.traverseInOrder();
		
//		System.out.println("\n" + tree1.get(60));
//		System.out.println(tree1.min());
//		System.out.println(tree1.max());
		
//		tree1.delete(462332);
//		tree1.traversePreOrder();
		
		tree1.bfs();
		System.out.println(tree1.validateBST());
	}
	

}
