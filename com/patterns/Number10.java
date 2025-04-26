package com.patterns;

public class Number10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

/*
Another pattern design of i and j value

11111
 2222
  333
   44
    5

*/