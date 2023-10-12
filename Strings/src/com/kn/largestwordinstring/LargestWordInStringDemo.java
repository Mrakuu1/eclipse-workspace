package com.kn.largestwordinstring;

import java.util.Scanner;



public class LargestWordInStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String s1 = scan.nextLine();
		
		//creating object to find largest word
		LargestWordInString lw = new LargestWordInString();
		
		//calling method to find longest word
		lw.largestWord(s1);
		
		scan.close();

	}

}
