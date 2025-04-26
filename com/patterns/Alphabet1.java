package com.patterns;

public class Alphabet1 {
	public static void main(String[] args) {
		int n=5;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((char)ch);
			}
			System.out.println();
		}
	}
}

/*
for uppercase letters int ch=65;

AAAAA
AAAAA
AAAAA
AAAAA
AAAAA

for lowercase letters use int ch=97;

aaaaa
aaaaa
aaaaa
aaaaa
aaaaa

*/