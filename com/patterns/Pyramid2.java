package com.patterns;

public class Pyramid2 {

	public static void main(String[] args) {
		int n=5;
		int spaces=0;
		int stars=2*n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			System.out.println();
			spaces++;
			stars-=2;
		}

	}

}

/*

*********
 *******
  *****
   ***
    *

*/