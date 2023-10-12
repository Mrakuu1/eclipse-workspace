package com.kn.WhileLoop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a range to calculate sum of series(1/n): ");
		
		double n = s.nextDouble();
		
		findSumOfSeries(n);
		s.close();
	}

	 static void findSumOfSeries(double n) {
		 double i=1;
		 double digit,sum = 0;
		 while(i<=n) {
			 digit = 1/i;
			 sum = sum + digit;
			 i++;
		 }
		 
		 System.out.println("The sum of series of given num is "+sum);
	}

}
