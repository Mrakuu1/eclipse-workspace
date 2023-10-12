package com.kn.nonrepeatingchar;

import java.util.Scanner;

public class NonRepeatingCharDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		//creating a object to count the occurance of character
		NonRepeatingChar nrchar = new NonRepeatingChar();
		
		//calling method to convert the given string to cipher text
		 nrchar.nonRepeatingChar(inputString);
		
		
		//release the resource
		scan.close();
	}

}
