package com.patterns;

public class Alphabet2 {
	public static void main(String[] args) {
		int n=5;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((char)ch);
			}
			ch++;
			System.out.println();
		}
	}
}

/*

AAAAA
BBBBB
CCCCC
DDDDD
EEEEE

for lowercase letters use int ch=97;

*/