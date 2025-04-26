package com.queue;

public class Queue {
	Object[] a;
	int pos;
	
	public Queue(){
		a=new Object[5];
		pos=0;
	}
	
	//add(): Inserts an element into the queue. Throws an exception if the queue is full
	public void add(Object e) {
		if(pos>=a.length) increase();
		a[pos++]=e;
	}
	
	//increase(): Increase the size of the queue if it is full
	private void increase() {
		Object[] temp=new Object[a.length +3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
 
	//isEmpty(): Checks if the queue is empty
	public boolean isEmpty() {
		return size()==0;	
	}
		
	//size(): Checks the total element of the queue
	public int size() {
		return pos;
	}
		
	//poll(): Removes and returns the head of the queue, or null if the queue is empty
	public Object poll() {
		if(isEmpty()) {
			return null;
		}
		Object ele=a[0];
		for(int i=1;i<size();i++) {
			a[i-1]=a[i];
		}
		pos--;
		a[pos]=null;
		return ele;
	}
		
	//peek(): Retrieves the head of the queue without removing it, or null if the queue is empty
	public Object peek() {
		if(isEmpty()) {
			return null;
		}
		return a[0];
	}
}
