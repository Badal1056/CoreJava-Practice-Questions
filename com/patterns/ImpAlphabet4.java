package com.patterns;

public class ImpAlphabet4 {

	public static void main(String[] args) {
		int n=9;
		int spaces=0;
		int stars1=n/2+1;
		int stars2=n/2;
		int ch=65;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=stars1; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=spaces; j++) {
				System.out.print((char)ch);
				ch++;
			}
			for(int j=1; j<=stars2; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i==1) {
				stars1--;
				spaces++;
			}
			else if(i<=n/2) {
				stars1--;
				spaces+=2;
				stars2--;
			}
			else if(i==n-1) {
				stars1++;
				spaces--;
			}
			else {
				stars1++;
				spaces-=2;
				stars2++;
			}
		}

	}

}

/*

*********
****A****
***BCD***
**EFGHI**
*JKLMNOP*
**QRSTU**
***VWX***
****Y****
*********

for lowercase letters use int ch=97;

*/
