package com.kn.WhileLoop;

import java.util.Scanner;

public class SumOfNOddNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range to find Sum of Odd numbers : ");

		int range = s.nextInt();

		sumOfOddNumbers(range);
		
		s.close();
	}

	static void sumOfOddNumbers(int range) {
		int sum = 0;
		int i = 1;
		while (i <= range) {
			if (range % i != 0) {
				sum = sum+i;
			}
			i++;
		}
		System.out.println("The sum of odd numbers in given range is = "+sum);
	}

}
