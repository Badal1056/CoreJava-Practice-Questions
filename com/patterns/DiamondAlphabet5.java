package com.patterns;

public class DiamondAlphabet5 {

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
				if(j==stars || j==1) {
					System.out.print((char)ch);
					ch++;
				}
				else System.out.print(" ");
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
   B C
  D   E
 F     G
H       I
 J     K
  L   M
   N O
    P

for lowercase letters use int ch=97;
*/