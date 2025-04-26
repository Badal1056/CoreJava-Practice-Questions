package com.hashset;

public class Node {
	int key; //for Object type write: Object key
	Node next;
	
	public Node(int k, Node n) { //for Object type write: public Node(Object k, Node n)
		key=k;
		next=n;
	}
}
