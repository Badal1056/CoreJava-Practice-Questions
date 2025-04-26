package com.patterns;

public class RightPyramid {
	public static void main(String[] args) {
        int n=7;
        int stars=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=stars;j++){
            	System.out.print("*");
            }
            System.out.println();
            if(i<n/2+1){
            	stars+=2;
            }
            else {
            	stars-=2;
            }
        }
	}
}

/*

*
***
*****
*******
*****
***
*

*/