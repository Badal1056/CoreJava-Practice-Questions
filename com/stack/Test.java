package com.stack;

public class Test {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		//Adding elements in stack
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		//to check the stack is empty or not
		System.out.println("Stack is Empty: "+s.isEmpty());
		
		//to get the size of the stack
		System.out.println("Size: "+s.size());
		
		//to get the top element of the stack
		System.out.println("Peek element: "+s.peek());
		
		System.out.println();
		//removing and returning (printing) all elements of the stack
		System.out.println("Stack elements: ");
		while(! s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println();
		
		//to check the stack is empty or not
		System.out.println("Stack is Empty: "+s.isEmpty());
				
		//to get the size of the stack
		System.out.println("Size: "+s.size());
	}
}

/*

Stack is Empty: false
Size: 4
Peek element: 40

Stack elements: 
40
30
20
10

Stack is Empty: true
Size: 0

*/