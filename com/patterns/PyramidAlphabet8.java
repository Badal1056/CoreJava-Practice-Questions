package com.patterns;

public class PyramidAlphabet8 {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int stars=1;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				if(j==1 || j==stars || i==n ) {
					System.out.print((char)ch);
					ch++;
				}
				else System.out.print(" ");
			}
			System.out.println();
			spaces--;
			stars+=2;
		}

	}

}

/*

    A
   B C
  D   E
 F     G
HIJKLMNOP

for lowercase letters use int ch=97;
*/