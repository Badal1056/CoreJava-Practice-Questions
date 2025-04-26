package com.queue;

public class Test {
	public static void main(String[] args) {
		Queue q=new Queue();
		
		//Adding elements in queue
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		//to check the queue is empty or not
		System.out.println("Queue is Empty: "+q.isEmpty());
		
		//to get the size of the queue
		System.out.println("Size: "+q.size());
				
		//to get the top element of the queue
		System.out.println("Peek element: "+q.peek());
			
		System.out.println();
		System.out.print("Queue elements: ");
		//removing and returning (printing) all elements of the queue
		while(! q.isEmpty()) {
			System.out.print(q.poll()+" ");
		}
		System.out.println();
		System.out.println();
		
		//to check the queue is empty or not
		System.out.println("Queue is Empty: "+q.isEmpty());
		
		//to get the size of the queue
		System.out.println("Size: "+q.size());
	}
}
