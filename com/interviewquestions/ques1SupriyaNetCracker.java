package com.interviewquestions;
import java.util.Scanner;
public class ques1SupriyaNetCracker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        for (int temp = 0; temp < testcases; temp++) {
            int N = scn.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            System.out.println();
            for (int i = 0; i < N; i++) {
                a[i] = scn.nextInt();
            }
            System.out.println();
            for (int i = 0; i < N; i++) {
                b[i] = scn.nextInt();
            }
            String result = canConvert(a, b, N);
            System.out.println(result);
        }
    }
    public static String canConvert(int[] a, int[] b, int N) {
        for (int i = 0; i < N - 1; i++) {  
            int diff = a[i] - b[i]; 
            if (diff < 0) {
                return "NO";
            } 
            a[i] -= diff;
            a[i + 1] -= diff;

            if (a[i + 1] < b[i + 1]) {
                return "NO";
            }
        }
        if (a[N - 1] != b[N - 1]) {
            return "NO";
        }
        return "YES";
    }
}


