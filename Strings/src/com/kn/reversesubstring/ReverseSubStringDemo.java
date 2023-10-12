package com.kn.reversesubstring;

import java.util.Scanner;

public class ReverseSubStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		
		//creating and taking a string input from user
		String inputString = scan.nextLine();

		
		// creating an object to reverse the given string
		 ReverseSubString reverseString = new ReverseSubString();
		 
		
		 System.out.println("The Reverse of the given String = ");
		 //calling method to reverse the string
		  reverseString.reverseString(inputString);
		 
		 //releasing the input
		 scan.close();
		 
	}

}
