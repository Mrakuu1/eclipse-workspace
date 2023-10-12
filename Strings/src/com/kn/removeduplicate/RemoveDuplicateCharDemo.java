package com.kn.removeduplicate;

import java.util.Scanner;

public class RemoveDuplicateCharDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s1 = scan.nextLine();
		
		RemoveDuplicateChar rdc = new RemoveDuplicateChar();
		
		System.out.println("The given string without duplicates = ");
		rdc.removeDuplicates(s1);
		
		scan.close();
	}

}
