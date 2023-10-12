//Write a program to calculate the factorial of a given number.

package com.kn.ForLoop;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number to find Factorial: ");
		
		int num = s.nextInt();
		
		int factorial = printFactorialOfNum(num);
		System.out.println("The factorial of given number is = "+factorial);
		s.close();
	}

	 static int printFactorialOfNum(int num) {
		 int fact =1;
		 for(int i=1; i<=num; i++) {
			 fact = fact * i;
		 }
		 return fact;
	}

}
