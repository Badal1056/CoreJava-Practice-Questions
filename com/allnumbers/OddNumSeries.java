package com.allnumbers;
import java.util.Scanner;
public class OddNumSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number of terms in the Odd Series: ");
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		int res=1;
		System.out.println("Odd Series up to " + n + " terms: ");
		for(int i=1; i<=n; i++) {
			System.out.print(res+" ");
			res+=2;
		}
	}
}
