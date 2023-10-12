package com.kn.ForLoop;

import java.util.Scanner;

public class SumOfSquareNumbersInRange {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range to find sum of Square number: ");
		
		int n = s.nextInt();
		
		findProuctOfSqNum(n);
		s.close();
	}

	 static void findProuctOfSqNum(int num) {
		 double sum = 0;
//		 int sq =1;
		 
		 
//		 int i=0;		
//			while (i<=num) {
//
//				
//				sq = i*i;
//				sum = sum + sq;
//				
//				i++;
//			}
//		 
		 for(int i=0; i<=num; i++ ) {
//			 	sq = i*i*i;
//				sum = sum + sq;
			  sum = sum + Math.pow(i, 2);
		 }
			System.out.println("The num of Square numbers = "+sum);
		
	}

}
