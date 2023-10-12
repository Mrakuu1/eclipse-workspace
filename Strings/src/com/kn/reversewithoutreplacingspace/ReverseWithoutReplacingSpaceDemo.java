package com.kn.reversewithoutreplacingspace;

import java.util.Scanner;

public class ReverseWithoutReplacingSpaceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		//creating a object to count the occurance of character
		ReverseWithoutReplacingSpace reverse = new ReverseWithoutReplacingSpace();
		
		//calling method to convert the given string to cipher text
		reverse.reverseWithoutReplacingSpace(inputString);
		
		//release the resource
		scan.close();
	}

}
