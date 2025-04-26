package com.arraylist;

public class ArrayList {
	private Object[] a;
	private int pos;
	
	public ArrayList() {
		a=new Object[5];
		pos=0;
	}
	
	//add() method: To add one new element automatically in the last of the ArrayList
	public void add(Object e) {
		if(pos>=a.length) increase();
		a[pos++]=e;
	}
	
	//add() method: To add one new element at given index (in between of the ArrayList)
	public void add(int index, Object e) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		} 
		if(pos>=a.length) increase();
		for(int i=size()-1;i>=index;i--) {
			a[i+1]=a[i];
		}
		a[index]=e;
		pos++;
	}
	
	//increase(): To increase the size of the ArrayList
	private void increase() {
		Object[] temp=new Object [a.length+3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
	}
	
	//size() method: To get size of the ArrayList i.e total number of elements are present in the ArrayList
	public int size() {
		return pos;
	}
	
	//get() method: To print or fetch elements of the ArrayList
	public Object get(int index) {
		if(index <= -1 || index >= size()) {
			IndexOutOfBoundsException e=new IndexOutOfBoundsException();
			throw e;
		} 
		return a[index];
	}
	
	//remove(): To remove elements from the given index
	public void remove(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		} 
		for(int i=index;i<size()-1;i++) {
			a[i]=a[i+1];
		}
		pos--;
		a[pos]=null;
	}
}
