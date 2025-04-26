package com.hashset;

public class Test {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		
		//Adding elements in HashSet
		s.add(10);//for Object type write: s.add("java");
		s.add(20);//for Object type write: s.add("python");
		s.add(30);//for Object type write: s.add("java");
		s.add(30);//for Object type write: s.add("cpp");
		s.add(40);//for Object type write: s.add("python");
		
		//Printing the elements of the HashSet
		System.out.print("HashSet elements: ");
		s.traverse();
		
		//to get the size of the HashSet
		System.out.println("Size: "+s.size());
		
		//to check the HashSet is empty or not
		System.out.println("HashSet is Empty: "+s.isEmpty());
	}
}
