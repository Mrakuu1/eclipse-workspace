package com.kn.uniquecharacter;

import java.util.Scanner;

public class UniqueCharDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();
		
		UniqueChar uc = new UniqueChar();
		uc.uniqueCharacters(s1);
		
		scan.close();
	}

}
