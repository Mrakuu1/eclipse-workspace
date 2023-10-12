package com.kn.strings;

public class StringComparison5 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		
		//String Concatenation without storing
		s1.concat(s2); // this will be concatenated but it will not addressed or printed
		
		//String Concatenation by storing into another string
		
		String s3 = s1.concat(s2);
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
	}

}
