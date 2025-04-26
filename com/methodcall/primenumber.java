package com.methodcall;
import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scn.nextInt();
		if(isPrime(n)) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
	}
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

/*

Enter a number: 53
53 is a prime number

*/