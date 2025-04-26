package com.allnumbers;

import java.util.Scanner;

public class StrongNumRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Get the range from the user
        System.out.println("Enter the starting number: ");
        int start = scn.nextInt();
        
        System.out.println("Enter the ending number: ");
        int end = scn.nextInt();

        System.out.println("Strong numbers between " + start + " and " + end + " are:");

        // Loop through the range
        for (int i = start; i <= end; i++) {
            int sum = 0;
            int temp = i;

            // Find the sum of factorials of digits
            while (temp > 0) {
                int digit = temp % 10;  // Extract the last digit
                int fact = 1;

                // Calculate the factorial of the digit
                for (int j = 1; j <= digit; j++) {
                    fact *= j;
                }

                sum += fact;  // Add factorial to sum
                temp /= 10;  // Remove the last digit
            }

            // Check if the sum of the factorials is equal to the original number
            if (sum == i) {
                System.out.println(i);  // Print the strong number
            }
        }
    }
}

