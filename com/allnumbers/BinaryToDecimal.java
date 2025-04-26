package com.allnumbers;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Binary number to convert in Decimal number: ");
		int n=scn.nextInt();
		int temp=n;
		int sum=0;
		int i=1;
		while(n>0) {
			int bit=n%10;
			sum+=bit*i;
			i*=2;
			n/=10;
		}
		System.out.println("Decimal number of "+temp+" is: "+sum);
	}
}

/*
Enter a Binary number to convert in Decimal number: 110010
Decimal number of 110010 is: 50
*/
