package com.kn.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");

		// creating and taking a string input from user
		String inputString = scan.nextLine();

		// creating an object to reverse the given string
		ReverseString rs = new ReverseString();

		System.out.println("The reverse of the given String = ");
		// calling method to reverse the string
		rs.reverseString(inputString);

		// releasing the input
		scan.close();
	}

}
