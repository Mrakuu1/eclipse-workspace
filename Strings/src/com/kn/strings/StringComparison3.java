package com.kn.strings;

public class StringComparison3 {

	public static void main(String[] args) {
		
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + "Sita";
		String s4 = "Ram" + s2;
		
		//Reference comparison
		if(s3==s4) {
			System.out.println("Refrence of s3 & s4 are pointing to same object");
		}else {
			System.out.println("Refrence of s3 & s4 are pointing to different object");
		}
		
		
		if(s3.equals(s4)) {
			System.out.println("String data of s3 & s4 are same");
		}else {
			System.out.println("String data of s5 & s4  are not same");
		}
		
	}

}
