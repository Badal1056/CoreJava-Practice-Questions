package com.singlelinkedlist;

public class LinkedList {
	private Node first;
	private int Count;
	
	//add() method: To add one new node element automatically in the last of the LinkedList
	public void add(Object e) {
		if(first==null) {
			first=new Node(e);
			Count++;
			return;
		}
		Node curr=first;
		while(curr.next != null) {
			curr=curr.next;
		}
		curr.next=new Node(e);
		Count++;
	}
	
	//add() method: To add one new node element at the given index of the LinkedList
	public void add(int index, Object e) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=new Node(e,first);
			Count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		Count++;
	}
	
	//size() method: To get size of the LinkedList i.e total number of nodes are present in the LinkedList
	public int size() {
		return Count;
	}
	
	//get() method: To print or fetch elements of the LinkedList
	public Object get(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=0;i<index;i++) {
			curr=curr.next;
		}
		return curr.ele;
	}
	
	//remove() method: To remove one element at given index from the LinkedList
	public void remove(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index==0) {
			first=first.next;
			Count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++) {
			curr=curr.next;
		}
		curr.next=curr.next.next;
		Count--;
	}
	
	//reverse() method: To reverse the whole LinkedList
	public void reverse() {
		Node curr=first;
		Node prev=null;
		Node next;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
