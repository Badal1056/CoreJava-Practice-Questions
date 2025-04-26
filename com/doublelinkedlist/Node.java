package com.doublelinkedlist;

public class Node {
	Object ele;
	Node prev;
	Node next;
	
	public Node(Object e) {
		ele=e;
	}
	public Node (Object e, Node p, Node n) {
		ele=e;
		prev=p;
		next=n;
	}
}
