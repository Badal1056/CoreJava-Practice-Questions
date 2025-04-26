package com.patterns;

public class DiamondAlphabet1 {

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
   AAA
  AAAAA
 AAAAAAA
AAAAAAAAA
 AAAAAAA
  AAAAA
   AAA
    A

for lowercase letters use int ch=97;
*/