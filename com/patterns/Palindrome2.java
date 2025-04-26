package com.patterns;

public class Palindrome2 {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=spaces; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				if(i==n || j==1 || j==n+1) {
                	System.out.print(j);
                }else {
                	System.out.print(" ");
			}
			}
            for (int j = i - 1; j >= 1; j--) {
                if(i==n || j==1 || j==n+1) {
                	System.out.print(j);
                }else {
                	System.out.print(" ");
                }
            }
			System.out.println();
		}

	}

}

/*
Hollow Palindrome

    1
   1 1
  1   1
 1     1
123454321

*/
