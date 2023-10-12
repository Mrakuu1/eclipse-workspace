/*
 Problem Statement 1: As a software developer, 
you're tasked with creating a simple validation system for a data entry application. 
The application is meant to process only positive integers. In order to guide user input, 
the system should print a guiding message "Positive number - processing..." if the entered number is greater than zero.

Sample Input 1: 27
Sample Output 1: Positive number - processing...
Sample Input 2: -12
Sample Output 2: 
 */



package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int number = s.nextInt();

		boolean res = checkNumber(number);

		if (res == true) {
			
			System.out.println("Positive number - processing...");

		}
		s.close();
	}

	static boolean checkNumber(int number) {
		if (number > 0) {
			return true;
		} else {
			return false;
		}
	
	}

}









/* output:
 Enter a number: 
16
Positive number - processing...




Enter a number: 
-2

 		
 
 */
