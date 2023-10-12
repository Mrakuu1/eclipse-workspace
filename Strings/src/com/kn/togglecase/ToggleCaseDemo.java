package com.kn.togglecase;

import java.util.Scanner;


public class ToggleCaseDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String = ");
		
		//creating and taking a string input from user
		String inputString = scan.nextLine();

		
		// creating an object to reverse the given string
		ToggleCase tc = new ToggleCase();
		 
		
		 System.out.println("The ToggleCase of the given String = ");
		 //calling method to reverse the string
		 tc.toggleCharCase(inputString);
		 
		 //releasing the input
		 scan.close();
	}

}
