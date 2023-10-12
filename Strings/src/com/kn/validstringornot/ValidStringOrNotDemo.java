package com.kn.validstringornot;

import java.util.Scanner;

public class ValidStringOrNotDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		
		
		//object to check the given String is Anagram or not
		ValidStringOrNot vor = new ValidStringOrNot();
		
		//
		boolean valid = vor.isValidStringOrNot(inputString);
		
		if(valid == true) {
			System.out.println("Entered String is valid");
		}else {
			System.out.println("Entered string is not valid");
		}
		
		//release the resource
		scan.close();
	}

}
