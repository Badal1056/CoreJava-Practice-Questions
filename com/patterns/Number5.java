package com.patterns;

public class Number5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*

    5
   45
  345
 2345
12345

*/