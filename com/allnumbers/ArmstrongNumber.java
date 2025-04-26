package com.allnumbers;
/*
 An Armstrong number (also known as a Narcissistic number or Pluperfect number) 
 It is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 e.g. 153
 */
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int count= String.valueOf(n).length();
		int sum=0;
		int temp=n;
		
		while(n>0) {
			int digit=n%10;
			sum+=Math.pow(digit, count);
			n/=10;
		}
		if(temp==sum) System.out.println(temp+" is an armstrong number");
		else System.out.println(temp+" is not an armstrong number");
	}
}
