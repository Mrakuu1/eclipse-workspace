package com.kn.countoccuranceofchar;

import java.util.Scanner;

public class CountOccuranceOfCharactersDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		//creating a object to count the occurance of character
		CountOccuranceOfCharacters count = new CountOccuranceOfCharacters();
		
		//calling method to convert the given string to cipher text
		count.countOccuranceOfChar(inputString);
		
		//release the resource
		scan.close();
	}

}
