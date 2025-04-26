package com.patterns;

public class Alphabet14 {
	public static void main(String[] args) {
		int n=5;
		int ch=65;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
	}
}

/*

    A
   BB
  CCC
 DDDD
EEEEE

for lowercase letters use int ch=97;

*/