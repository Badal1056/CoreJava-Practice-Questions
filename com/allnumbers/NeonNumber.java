package com.allnumbers;
/*
  A Neon number is a number where the sum of the digits of the square of the number is equal to the number itself.
  e.g. 9
 */
import java.util.Scanner;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int sq=n*n;
		int sum=0;
		
		while(sq>0){
			sum+=sq%10;
			sq/=10;
		}
		if(n==sum) System.out.println(n+" is a neon number");
		else System.out.println(n+" is not a neon number");
	}
}