package com.patterns;

public class Number8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

/*
Opposite of Number4 Pattern Program

55555
4444
333
22
1

*/