package com.allnumbers;
/*
  A Strong number is a special number whose sum of the factorials of its each digits is equal to the original number.
  e.g. 145
 */
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n=scn.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++) {
				fact*=i;
			}
			sum+=fact;
			n/=10;
		}
		if(temp==sum) System.out.println(temp+" is a strong number");
		else System.out.println(temp+" is not a strong number");
	}
}


