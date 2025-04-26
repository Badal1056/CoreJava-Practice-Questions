package com.singlelinkedlist;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Node first=null;
		
		//Ist Approch to add new node elements 
		/*
		first=new Node(10);
		first.next=new Node(20);
		first.next.next=new Node(30);
		first.next.next.next=new Node(40);
		
		Node curr=first;
		while(curr!=null) {
			System.out.print(curr.ele +" ");
			curr=curr.next;
		}
		*/
		
		//2nd Approch to avoid (.next) multiple times so use add() method to add new node elements in linked list automatically
		
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		//To get or display LinkedList values
		System.out.print("Single Linked List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		
		System.out.println();
		
		//To get the size of the LinkedList
		System.out.println("Size: " + l.size());
		
		//Adding value 50 to the 2nd index in the LinkedList
		l.add(2, 50);
		System.out.print("Single Linked List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.println("Size: " + l.size());
		
		//Removing 3rd index value from the LinkedList
		l.remove(3);
		
		System.out.print("Single Linked List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.println("Size: " + l.size());
		
		//Reversing the whole LinkedList
		l.reverse();
		System.out.print("Single Linked List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		
		System.out.println();
		
		System.out.println("Size: " + l.size());
	}
}

/*

Single Linked List: 10 20 30 40 
Size: 4
Single Linked List: 10 20 50 30 40 
Size: 5
Single Linked List: 10 20 50 40 
Size: 4
Single Linked List: 40 50 20 10 
Size: 4

 */
