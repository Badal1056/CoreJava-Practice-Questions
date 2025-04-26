package com.hashset;

public class HashSet {
	private Node[] a=new Node[10];
	private int count=0;
	
	//add(): Adds the specified element to the set if it is not already present
	public boolean add(int key) { //for Object type write: public boolean add(Object key){
		int index=key%a.length; //for Object type write: int index=key.hashCode()%a.length;
		index=Math.abs(index);
		if(a[index]==null) {
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null) {
			if(key==curr.key) return false; //for Object type write: if(key.equals(curr.key)) return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	
	//isEmpty(): Returns true if the set is empty
	public boolean isEmpty() {
		return count==0;
	}
	
	//size(): Returns the number of elements in the set
	public int size() {
		return count;
	}
	
	//traverse(): Used to iterate over all the elements of the HashSet
	public void traverse() {
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
		}
		System.out.println();
	}
}
