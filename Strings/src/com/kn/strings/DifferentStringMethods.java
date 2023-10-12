package com.kn.strings;

public class DifferentStringMethods {

	public static void main(String[] args) {
		String s1 = "Raja Ram Mohan Roy";
		
		System.out.println("***************************");
		// Converts String values to Upper case
		System.out.println(s1.toUpperCase());
		
		System.out.println("***************************");
		// Converts String values to Lower case
		System.out.println(s1.toLowerCase());

		System.out.println("***************************");
		// prints the value present in the given index
		System.out.println(s1.charAt(7));

		System.out.println("***************************");
		// Verifies whether the given string is present or not
		System.out.println(s1.contains("We"));

		System.out.println("***************************");
		// begins and ends with the given indexes
		System.out.println(s1.substring(0, 11));

		System.out.println("***************************");
		// prints the length of the given String
		System.out.println(s1.length());

		System.out.println("***************************");
		// verifies whether the string starts with the specified prefix
		System.out.println(s1.startsWith("Raja"));

		System.out.println("***************************");
		// verifies whether the string ends with the specified prefix
		System.out.println(s1.endsWith("Roy"));

		System.out.println("***************************");
		
		// converts string to char of arrays
		char[] s2 = s1.toCharArray();

		for (int i = s2.length - 1; i >= 0; i--) {
			System.out.print(s2[i]);
		}
		
		System.out.println();
		
		System.out.println("***************************");
		//returns array of strings splited using specified regex(regular expression)/delimiter
		String[] s3 = s1.split(" ");
		for (int i = s3.length - 1; i >= 0; i--) {
			System.out.print(s3[i] + " ");
		}

		System.out.println();
		
		System.out.println("***************************");
		//this will trim/remove the unnecessary spaces in beginning and end of the given strings
		System.out.println(s1.trim());

		System.out.println("***************************");
		//Replaces each substring of this string that matches the literal 
		//target sequence with the specified literal replacement sequence
		System.out.println(s1.replace("R", "P"));

		System.out.println("***************************");
		//Replaces each substring of this string that matches 
		//the given regular expression with the given replacement
		System.out.println(s1.replaceAll("a", "i"));
	}

}
