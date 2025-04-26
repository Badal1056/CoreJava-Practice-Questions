package com.allnumbers;
/*
  Prime Number is a natural number greater than 1 that has no divisors other than 1 and itself.
  e.g. 2 (smallest and only even prime number)
       3,5,7,11,13,17,19,23
*/
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		boolean flag=true;
		
		if(n<=1) System.out.println(n+" is not a prime number"); 
		else{
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) System.out.println(n+" is a prime number");
			else System.out.println(n+" is not a prime number");
		}
	}
}
