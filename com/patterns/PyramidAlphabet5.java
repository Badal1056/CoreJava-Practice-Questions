package com.patterns;

public class PyramidAlphabet5 {

	public static void main(String[] args) {
		int n=5;
		int spaces=0;
		int stars=2*n-1;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=stars; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
			spaces++;
			stars-=2;
		}

	}

}

/*

AAAAAAAAA
 BBBBBBB
  CCCCC
   DDD
    E

for lowercase letters use int ch=97;
*/