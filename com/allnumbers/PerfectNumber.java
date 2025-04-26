package com.allnumbers;
/*
  A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. 
  In other words, when you sum up all the divisors of the number, other than the number itself, the sum equals the number.
  e.g. 6,28,496,8128
 */
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) sum+=i;
		}
		if(sum==n) System.out.println(n+" is a perfect number");
		else System.out.println(n+" is not a perfect number");
	}
}