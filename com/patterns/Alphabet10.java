package com.patterns;

public class Alphabet10 {
	public static void main(String[] args) {
		int n=5;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print((char)ch);
			}
			System.out.println();
		}
	}
}

/*

AAAAA
 AAAA
  AAA
   AA
    A

for lowercase letters use int ch=97;

*/