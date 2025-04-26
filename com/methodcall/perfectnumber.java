package com.methodcall;
import java.util.Scanner;
public class perfectnumber {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=scn.nextInt();
		if(isPerfect(n)) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
	}
	public static boolean isPerfect(int n) {
		if(n<=0) return false;
		int sum = 0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if (sum==n) return true;
		else return false;
	}
}

/*

Enter a number: 8128
8128 is a perfect number

*/