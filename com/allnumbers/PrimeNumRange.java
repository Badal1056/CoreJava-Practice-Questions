package com.allnumbers;
/*
  Printing Prime number in given range.
  e.g. Prime numbers between 1 and 10 are: 2,3,5,7

 */
import java.util.Scanner;
public class PrimeNumRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input for the range
        System.out.println("Enter the first number: ");
        int a = scn.nextInt();

        System.out.println("Enter the last number: ");
        int b = scn.nextInt();

        // Prime number check for each number in the range
        System.out.println("Prime numbers between " + a + " and " + b + " are:");
        
        for (int i = a; i <= b; i++) {
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
