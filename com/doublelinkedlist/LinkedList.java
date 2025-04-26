package com.doublelinkedlist;

public class LinkedList {
	private Node first;
	private int count;
	
	//add() method: To add one new node element automatically in the last of the LinkedList
		public void add(Object e) {
			if(first==null) {
				first=new Node(e);
				count++;
				return;
			}
			Node curr=first;
			while(curr.next != null) {
				curr=curr.next;
			}
			curr.next=new Node(e,curr,null);
			count++;
			return;
		}
		
		//add() method: To add one new node element at the given index of the LinkedList
		public void add(int index, Object e) {
			if(index <= -1 || index >= size()) {
				throw new IndexOutOfBoundsException();
			}
			if(index==0) {
				Node n=new Node(e,null,first);
				first.prev=n;
				count++;
				return;
			}
			Node curr=first;
			for(int i=1;i<index;i++) {
				curr=curr.next;
			}
			Node n=new Node(e,curr,curr.next);
			curr.next.prev=n;
			curr.next=n;
			count++;
		}
		
		//size() method: To get size of the LinkedList i.e total number of nodes are present in the LinkedList
		public int size() {
			return count;
		}
		
		//get() method: To fetch elements at given index of the LinkedList
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
		
		//traverse(): To print the list of elements of the LinkedList
		public void traverse() {
			Node curr=first;
			System.out.print("Double Linked List: ");
			while(curr!=null) {
				System.out.print(curr.ele+" ");
				curr=curr.next;
			}
			System.out.println();
		}
		
		//remove() method: To remove one element at given index from the LinkedList
		public void remove(int index) {
			if(index <= -1 || index >= size()) {
				throw new IndexOutOfBoundsException();
			}
			if(index==0) {
				first=first.next;
				first.prev=null;
				count--;
				return;
			}
			Node curr=first;
			for(int i=1;i<index;i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
			if(curr.next!=null) curr.next.prev=curr;
			count--;
		}
		
		//reverse() method: To reverse the whole LinkedList
		public void reverse() {
			Node curr=first;
			Node prev=null;
			Node next=null;
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				curr.prev=next;
				prev=curr;
				curr=next;
			}
			first=prev;
		}
}
