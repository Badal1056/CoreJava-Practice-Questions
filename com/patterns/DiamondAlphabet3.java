package com.patterns;

public class DiamondAlphabet3 {

	public static void main(String[] args) {
		int n=9;
		int spaces=n/2;
		int stars=1;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
			if (i<n/2+1) {
				spaces--;
				stars+=2;
			}
			else {
				spaces++;
				stars-=2;
			}
		}

	}

}

/*

    A
   BCD
  EFGHI
 JKLMNOP
QRSTUVWXY
 Z[\]^_`
  abcde
   fgh
    i

After ASCII value of Z i.e 97 it will automatically take next lowercase values and print it's characters
*/