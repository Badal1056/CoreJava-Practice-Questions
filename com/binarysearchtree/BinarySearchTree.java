package com.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root=null;
	@SuppressWarnings("unused")
	private int count=0;
	
	//Adding Nodes in Binary Search Tree
	public void add(int k) {
		root=addNode(root,k);
	}
	private Node addNode(Node n,int k) {
		if(n==null) {
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key) {
			n.left=addNode(n.left,k);
		}
		else if(k>n.key) {
			n.right=addNode(n.right,k);
		}
		return n;
	}
	
	//TRAVERSING METHODS OF BINARY SEARCH TREE
	
	//Breadth-First Traversing- "level order traversing"
	public void levelOrder() {
		Queue<Node> q=new LinkedList<Node>();
		if(root!=null) {
			q.add(root);
		}
		System.out.print("level order traversal: ");
		while(!q.isEmpty()) {
			Node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
		System.out.println();
	}
	
	//Depth-First Traversing- "pre order traversing"
		public void preOrder() {
			System.out.print("pre order traversal: ");
			preOrder(root);
			System.out.println();
		}
		private void preOrder(Node n) {
			if(n==null) return;
			System.out.print(n.key+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
		
		//Depth-First Traversing- "post order traversing"
		public void postOrder() {
			System.out.print("post order traversal: ");
			postOrder(root);
			System.out.println();
		}
		private void postOrder(Node n) {
			if(n==null) return;
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key+" ");
		}
		
		//Depth-First Traversing- "in order traversing"
		public void inOrder() {
			System.out.print("in order traversal: ");
			inOrder(root);
			System.out.println();
		}
		private void inOrder(Node n) {
			if(n==null) return;
			inOrder(n.left);
			System.out.print(n.key+" ");
			inOrder(n.right);
		}
		
		//Smallest number in Binary Search Tree
		public int Smallest() {
			Node n=minNode(root);
			return n.key;
		}
		private Node minNode(Node n) {
			if(n.left==null) return n;
			return minNode(n.left);
		}
		
		//Biggest number in Binary Search Tree
		public int Biggest() {
			Node n=maxNode(root);
			return n.key;
		}
		private Node maxNode(Node n) {
			if(n.right==null) return n;
			return maxNode(n.right);
		}
		
		//Removing a node in Binary Search Tree
		public void remove(int key) {
			root=removeNode(root,key);
		}
		private Node removeNode(Node n,int key) {
			if(n==null) return n;
			if(key<n.key) n.left=removeNode(n.left,key);
			else if(key>n.key) n.right=removeNode(n.right,key);
			else {
				if(n.left==null && n.right==null) n=null;
				else if(n.left==null) n=n.right;
				else if(n.right==null) n=n.left;
				else {
					Node a=minNode(n.right);
					int temp=n.key;
					n.key=a.key;
					a.key=temp;
					n.right=removeNode(n.right,key);
				}
			}
			return n;
		}
}
