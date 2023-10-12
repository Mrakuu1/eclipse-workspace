package com.kn.titlecase;

import java.util.Scanner;

public class TitleCaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		
		//creating and taking a string input from user
		String inputString = scan.nextLine();

		
		// creating an object to reverse the given string
		TitleCase tc = new TitleCase();
		 
		
		 System.out.println("The ToggleCase of the given String = ");
		 //calling method to reverse the string
		 tc.toUpperCase(inputString);
		 
		 //releasing the input
		 scan.close();
	}

}
