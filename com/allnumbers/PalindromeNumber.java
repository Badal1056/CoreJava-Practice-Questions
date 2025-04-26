package com.allnumbers;
/*
A palindrome number is a number that remains the same when its digits are reversed. 
In other words, if you read the number from left to right and from right to left, it will look the same.
 e.g. 121,12321
 */
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int temp=n;
		int reversedNum=0;
		
		while(n>0) {
			int digit = n % 10;
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            n /= 10;
		}
		if(temp==reversedNum) System.out.println(temp+" is a palindrome number");
		else System.out.println(temp+" is not a palindrome number");
	}
}
