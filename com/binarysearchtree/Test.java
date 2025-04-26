package com.binarysearchtree;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree b=new BinarySearchTree();
		
		//Adding values in Binary Search Tree
		b.add(50);
		b.add(30);
		b.add(20);
		b.add(80);
		b.add(40);
		b.add(90);
		b.add(60);
		
		//All Traversal methods of Binary Search Tree
		b.levelOrder();
		b.preOrder();
		b.postOrder();
		b.inOrder();
		
		//Smallest number in Binary Search Tree
		System.out.println("Smallest Node: "+b.Smallest());
		
		//Biggest number in Binary Search Tree
		System.out.println("Biggest Node: "+b.Biggest());
		
		//Deleting a node from Binary Search Tree
		b.remove(60);
		b.inOrder();
	}
}
