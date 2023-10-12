package com.kn.WhileLoop;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find its Reverse: ");

		int num = s.nextInt();

		int result = sumOfDigit(num);
		
		System.out.println("The reverse of given number is = "+result);
		
		s.close();
	}

	public static int sumOfDigit(int num) {
		int digit = 0;
		int rev = 0;
		while (num != 0) {

			digit = num % 10;
			rev = rev*10 + digit;
			num = num / 10;

		}
		return rev;
	}

}
