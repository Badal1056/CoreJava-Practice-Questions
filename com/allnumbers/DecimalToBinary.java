package com.allnumbers;
import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a Decimal number to convert in Binary number: ");
		int n=scn.nextInt();
		int temp=n;
		String str="";
		while(n>0) {
			int bit=n%2;
			n/=2;
			str=bit+str;//to print output in MSB to LSB order
		}
		System.out.println("Binary number of "+temp+" is: "+str);
	}
}

/*
 Enter a Decimal number to convert in Binary number: 50
 Binary number of 50 is: 110010
*/
