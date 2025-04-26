package com.interviewquestions;
import java.util.Scanner;

public class numToword {
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
    	System.out.println("Enter a number: ");
        int num=scn.nextInt();
        pw(num/10000000," crores ");
        pw((num/100000)%100," lakhs ");
        pw((num/1000)%100," thousands ");
        pw((num/100)%10," hundreds ");
        pw(num%100," ");
    }
    static void pw(int num,String s){
        String[] one={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] two={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        if(num<=19) System.out.print(one[num]);
        else System.out.print(two[num/10]+" "+one[num%10]);
        if(num!=0) System.out.print(s);
    }
}

/*
Enter a number: 
12454875
one crores twenty four lakhs fifty four thousands eight hundreds seventy five 
 */
