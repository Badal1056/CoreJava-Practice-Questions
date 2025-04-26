package com.doublelinkedlist;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Node first=null;
		LinkedList l=new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.traverse();//To get or display LinkedList value
		
		System.out.println("Size: "+l.size());//To get the size of the LinkedList
		
		l.add(2, 50);//Adding value 50 to the 2nd index in the LinkedList
		l.traverse();
		System.out.println("Size: "+l.size());
		
		l.remove(3);//Removing 3rd index value from the Arraylist
		l.traverse();
		System.out.println("Size: "+l.size());
		
		l.reverse();//Reversing the whole LinkedList
		l.traverse();
		System.out.println("Size: "+l.size());
	}
}

/*

Double Linked List: 10 20 30 40 
Size: 4
Double Linked List: 10 20 50 30 40 
Size: 5
Double Linked List: 10 20 50 40 
Size: 4
Double Linked List: 40 50 20 10 
Size: 4

*/