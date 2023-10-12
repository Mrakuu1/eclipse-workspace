package com.kn.palindrome;

import java.util.Scanner;



public class PalindromeStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		// creating and taking a string input from user
		String inputString = scan.nextLine();

		// creating an object to reverse the given string
		PalindromeString palindrome = new PalindromeString();

		// calling method to check the give string is palindrome or not

		if (palindrome.palindromeString(inputString) == true) {
			System.out.println("The Entered String is palindrome");
		} else {
			System.out.println("The Entered String is not palindrome");
		}
		// releasing the input
		scan.close();
	}

}
