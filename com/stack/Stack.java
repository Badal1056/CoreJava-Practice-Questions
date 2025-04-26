package com.stack;

import java.util.EmptyStackException;

public class Stack {
	Node head=null;
	int count=0;
	
	//push(): Adds an element to the top of the stack
	public void push(Object e) {
		if(head==null) {
			head=new Node(e,null);
			count++;
			return;
		}
		head=new Node(e,head);
		count++;
	}
	
	//isEmpty(): Checks if the stack is empty
	public boolean isEmpty() {
		return count==0;
	}
	
	//size(): Checks the total element of the stack
	public int size() {
		return count;
	}
	
	//pop(): Removes and returns the top element from the stack. Throws EmptyStackException if the stack is empty.
	public Object pop() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		Object ele=head.ele;
		head=head.next;
		count--;
		return ele;
	}
	
	//peek(): Returns the top element without removing it. Throws EmptyStackException if the stack is empty.
	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return head.ele;
	}
}
