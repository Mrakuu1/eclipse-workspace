package com.kn.WhileLoop;

import java.util.Scanner;

public class ProductOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find product its: ");

		int num = s.nextInt();

		int result = sumOfDigit(num);
		System.out.println("The product of given number is = "+result);
		s.close();
	}

	private static int sumOfDigit(int num) {
		int digit = 0;
		int product = 1;

		while (num != 0) {

			digit = num % 10;
			product = product * digit;
			num = num / 10;

		}
		return product;
	}


}
