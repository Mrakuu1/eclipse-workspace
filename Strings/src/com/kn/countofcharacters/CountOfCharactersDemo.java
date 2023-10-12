package com.kn.countofcharacters;

import java.util.Scanner;

public class CountOfCharactersDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();
		
		//taking Character input from user
		System.out.println("Enter a char to find its count: ");
		char c = scan.next().charAt(0);
		CountOfCharacters rdc = new CountOfCharacters();
		
		//calling method to find count of character
		rdc.countOfCharacters(s1,c);

		scan.close();
	}

}
