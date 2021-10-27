package com.udemy_datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

	private Node root;

	public MyTree() {

	}

	public void insert(int data) {
		Node node = new Node(data);
		if (root == null) {
			root = node;
		} else {
			root.insert(node);
		}
	}

	public Node get(int data) {
		if (root.data == data) {
			return root;
		} else {
			return root.get(data);
		}
	}

	public void traverseInOrder() {
		System.out.println("\nContents of tree by in-order traversal:");
		if (root != null) {
			root.traverse();
		}
	}
	
	public void traversePreOrder() {
		System.out.println("\nContents of tree by pre-order traversal:");
		if(root != null) {
			root.traversePreOrder();
		}
	}
	
	public Node min() {
		if(root.left != null) {
			return root.min();
		}
		return root;
	}
	
	public Node max() {
		if(root != null) {
			return root.max();
		} else {
			return null;
		}
	}
	
	public void delete(int data) {
		root = delete(root, data);
	}
	
	public Node delete(Node node, int data) {
		if(node == null) {
			return node;
		}
		
		if(data < node.data) {
			node.left = delete(node.left, data);
		} else if (data > node.data) {
			node.right = delete(node.right, data);		}
		else { // data == node.data
			// Delete case where node to be deleted is a lead node or has only 1 child.
			if(node.left == null) {
				return node.right;
			} else if (node.right == null) {
				return node.left;
			}
			
			//Delete where node has 2 children
			
			//Traverse to the smallest node in the right subtree or
			//Traverse to the largest node in the left subtree
			node.data = node.right.min().data;
			
			//Delete the replacement node
			node.right = delete(node.right, node.data);
		}
		return node;	// If code reaches here, the "node" is the not the node to be deleted.
	}
	
	public void bfs() {
		System.out.println("\nContents of tree by BFS:");
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
	
	public boolean validateBST() {
		return false;
	}

	private class Node {

		private int data;
		private Node left;
		private Node right;

		Node(int data) {
			this.data = data;
		}

		private void insert(Node node) {
			if (node.data == data) {
				// We are not allowing duplicate values to be inserted.
				return;
			}
			if (node.data < data) {
				if (left == null) {
					left = node;
				} else {
					left.insert(node);
				}
			} else {
				if (right == null) {
					right = node;
				} else {
					right.insert(node);
				}
			}
		}

		private Node get(int data) {
			if (this.data == data) {
				return this;
			}
			if (data < this.data) {
				if(left != null) {
					return left.get(data);
				}
			} else {
				if (right != null) {
					return right.get(data);
				}
			}
			return null;

		}

		public void traverse() {
			if (left != null) {
				left.traverse();
			}
			System.out.print(this.data + ", ");
			if (right != null) {
				right.traverse();
			}
		}
		
		public void traversePreOrder() {
			System.out.print(this.data + ", ");
			if(left != null) {
				left.traversePreOrder();
			}
			if(right != null) {
				right.traversePreOrder();
			}
		}
		
		public Node min() {
			if(left == null) {
				return this;
			} else {
				return left.min();
			}
		}
		
		public Node max() {
			if(right != null) {
				return right.max();
			} else {
				return this;
			}
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		
		
	}

}
