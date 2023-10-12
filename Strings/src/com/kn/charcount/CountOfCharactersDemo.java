package com.kn.charcount;

import java.util.Scanner;

public class CountOfCharactersDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		//creating a object to calculate count of character
		CountOfCharacters coc= new CountOfCharacters();
		
		//calling method to count the characters for the given string 
		coc.countOfChar(inputString);
		
		//release the resource
		scan.close();
	}

}
