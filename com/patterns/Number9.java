package com.patterns;

public class Number9 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=1; i--) {
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
Reverse counting pattern of Number4 program but pattern design as Number5 program

    5
   44
  333
 2222
11111

*/