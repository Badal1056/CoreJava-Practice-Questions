package com.patterns;

public class LeftPyramidHollow {
	public static void main(String[] args) {
        int n=7;
        int stars=1;
        int spaces=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
            	if(j==1 || j==stars ) {
            		System.out.print("*");
            	}
            	else {
            		System.out.print(" ");
            	}
            }
            System.out.println();
            if(i<n/2+1){
            	spaces-=2;
                stars+=2;
            }
            else {
            	spaces+=2;
            	stars-=2;
            }
        }
	}
}

/*

      *
    * *
  *   *
*     *
  *   *
    * *
      *

*/