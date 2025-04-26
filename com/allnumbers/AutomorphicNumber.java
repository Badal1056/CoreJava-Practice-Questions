package com.allnumbers;
/*
  An automorphic number is a number whose square ends with the same digits as the number itself. 
  In other words, if you square the number, the last digits of the result (from the right) are the same as the original number.
  e.g. 5,6,25,76
 */
import java.util.Scanner;
public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int temp=n;
		int sq=n*n;
		boolean flag=true;
		while(n>0) {
			if(n%10 != sq%10) {
				flag=false;
				break;
			}
			n/=10;
			sq/=10;
		}
		if(flag) System.out.println(temp+" is a automorphic number");
		else System.out.println(temp+" is not a automorphic number");
	}
}