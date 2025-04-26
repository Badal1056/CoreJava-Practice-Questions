package com.allnumbers;
/*
  Swapping two numbers means exchanging the values of two variables. 
  e.g. if a = 5 and b = 10, after swapping, a would be 10 and b would be 5.
 */
import java.util.Scanner;
public class SwapNumber {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a=scn.nextInt();
		
		System.out.println("Enter second number: ");
		int b=scn.nextInt();
		
		System.out.println("Before Swapping: a= "+a+ ", b= "+b);
		
		//With the help of temp variable
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping: a= "+a+ ", b= "+b);
		
		/*With the help of Addition and Subtraction
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping: a= "+a+ ", b= "+b);
		
		With the help of XOR operations
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swapping: a= "+a+ ", b= "+b);
		*/
	}
}
