package com.kn.WhileLoop;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find SUM: ");

		int num = s.nextInt();

		int result = sumOfDigit(num);
		System.out.println("The sum of given number is = "+result);
		s.close();
	}

	private static int sumOfDigit(int num) {
		int digit = 0;
		int sum = 0;

		while (num != 0) {

			digit = num % 10;
			sum = sum + digit;
			num = num / 10;

		}
		return sum;
	}

}
