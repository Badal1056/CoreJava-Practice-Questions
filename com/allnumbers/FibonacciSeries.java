package com.allnumbers;
/*
  The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, 
  typically starting with 0 and 1. 
  It is also known as Fibonacci sequence.
  e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
  
  0 and 1 are the first two numbers.
  The next number is 0+1=1.
  The next is 1+1=2.
  Then 1+2=3, 2+3=5, 3+5=8, and so on...
*/
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number of terms in the Fibonacci Series: ");
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int firstnum=0;
		int secondnum=1;
		
		System.out.println("Fibonacci Series up to " + n + " terms: ");
		for(int i=1; i<=n; i++) {
			System.out.print(firstnum+" ");
			int thirdnum= firstnum+secondnum;
			firstnum=secondnum;
			secondnum=thirdnum;
		}
	}
}
