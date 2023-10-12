//Write a program to calculate the sum of first n natural numbers.
package com.kn.ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a natural number to calculate the sum");
		int n = s.nextInt();
		
		int res =sumOfNaturalNum(n);
		System.out.println("Sum of Natural number = "+res);
		
		s.close();
	}

	 static int sumOfNaturalNum(int n) {
		 int sum = 0;
		 for(int i=0; i<=n; i++) {
			 sum = sum+i;
		 }
		 return sum;
	}

}
