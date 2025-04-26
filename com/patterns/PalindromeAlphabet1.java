package com.patterns;

public class PalindromeAlphabet1 {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print((char)ch);
				ch++;
			}
			ch--;
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char)ch);
            }
			System.out.println();
		}

	}

}

/*
Normal Palindrome

    1
   121
  12321
 1234321
123454321

for lowercase letters use char ch=97;
*/