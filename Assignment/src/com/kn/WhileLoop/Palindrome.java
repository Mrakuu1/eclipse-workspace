package com.kn.WhileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to check Palindrome or not: ");

		int num = s.nextInt();

		int result = isPalindromeOrNot(num);

		if (result == num) {
			System.out.println(result + " is a palindrome");
		} else {
			System.out.println(result + " is not a palindrome");
		}
		s.close();
	}

	private static int isPalindromeOrNot(int num) {
		int digit = 0;
		int rev = 0;

		while (num != 0) {

			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		return rev;
	}

}
