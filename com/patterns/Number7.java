package com.patterns;

public class Number7 {
	public static void main(String[] args) {
		int n=5;
		for(int i=n; i>=1; i--) {
			for(int j=i; j<=n; j++) {
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