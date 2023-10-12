package com.kn.anagramstring;

import java.util.Scanner;

public class AnagramStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String1: ");
		String input1 = scan.nextLine();
		
		System.out.println("Enter the String2: ");
		String input2 = scan.nextLine();
		
		//object to check the given String is Anagram or not
		AnagramLength al = new AnagramLength();
		
		//
		boolean isAnagram = al.anagramLength(input1, input2);
		
		if(isAnagram == true) {
			System.out.println(input1 + " & "+ input2 +" are Anagram Strings");
		}else {
			System.out.println(input1 + " & "+ input2 +" are not Anagram Strings");
		}
		
		//release the resource
		scan.close();
	}

}
