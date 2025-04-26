package com.allnumbers;
import java.util.Scanner;
public class PrimeNumSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number of terms in the Prime Series: ");
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		System.out.println("Prime Series up to " + n + " terms: ");
		for(int i=1; i<=n; i++) {
			boolean flag = true;

            // Ignore numbers less than 2, as prime numbers are greater than 1
            if (i <= 1) {
                continue;
            }

            // Check divisibility to determine primality
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (flag) {
                System.out.print(i+" ");
            }
		}
	}
}