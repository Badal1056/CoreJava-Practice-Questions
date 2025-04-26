package com.interviewquestions;
import java.util.Scanner;

public class ques2SupriyaNetCracker {
    public static boolean isValidString(String S) {
        // To keep track of valid sequences
        int countA = 0; // Number of 'a' encountered
        int countB = 0; // Number of 'b' encountered
        
        for (char ch : S.toCharArray()) {
            if (ch == 'a') {
                countA++;  // Encounter 'a', increment countA
            } else if (ch == 'b') {
                countB++;  // Encounter 'b', increment countB
            } else if (ch == 'c') {
                // For every 'c', check if it follows the "abc" rule
                if (countB > 0 && countA > 0) {
                    countB--; // Use one 'b' and one 'a' for this 'c'
                    countA--; // Decrease count of 'a' after using it
                } else {
                    return false; // If we don't have 'b' and 'a' available before 'c'
                }
            } else {
                return false; // Invalid character
            }
        }
        
        // After processing the string, all 'a' and 'b' should be used in valid sequences
        return countA == 0 && countB == 0;
    }

    // Main function to handle input and output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String S = sc.nextLine().trim();

        // Check if the string is valid
        boolean isValid = isValidString(S);

        // Output the result
        System.out.println(isValid);

        sc.close();
    }
}
