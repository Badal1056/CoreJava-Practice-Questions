package com.allnumbers;
/*
  A Spy Number is a number where the sum of its digits is equal to the product of its digits.
  e.g. 123,1124,4211,132
 */
import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int temp=n;
		int sq=1;
		int sum=0;
		
		while(n>0) {
			sum+=n%10;
			sq*=n%10;
			n/=10;
		}
		if(sum==sq) System.out.println(temp+" is a spy number");
		else System.out.println(temp+" is not a spy number");
	}
}