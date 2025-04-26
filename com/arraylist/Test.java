package com.arraylist;

public class Test {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		//To get or display ArrayList values
		System.out.print("Array List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		//To get the size of the ArrayList
		System.out.println("Size: " + l.size());
		
		//Adding value 50 to the 2nd index in the ArrayList
		l.add(2, 50);
		
		System.out.print("Array List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Size: " + l.size());
		
		//Removing 2nd index value from the Arraylist
		l.remove(3);
		
		System.out.print("Array List: ");
		for (int i = 0; i < l.size(); i++) {
		    System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Size: " + l.size());
	}
}
/*
 
Array List: 10 20 30 40 
Size: 4
Array List: 10 20 50 30 40 
Size: 5
Array List: 10 20 30 40 
Size: 4
 
 */
