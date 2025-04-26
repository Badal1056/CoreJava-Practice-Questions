package com.patterns;

public class P1 {

	public static void main(String[] args) {
		int n=5;
		int spaces=0;
		int stars=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

/*

*****
*****
*****
*****
*****

*/