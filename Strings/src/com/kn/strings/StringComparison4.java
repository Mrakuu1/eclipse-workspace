package com.kn.strings;

public class StringComparison4 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = s1;
		
		//Reference comparison
				if(s1==s2) {
					System.out.println("Refrence of s1 & s2 are pointing to same object");
				}else {
					System.out.println("Refrence of s1 & s2 are pointing to different object");
				}
				
				
				if(s1.equals(s2)) {
					System.out.println("String data of s1 & s2 are same");
				}else {
					System.out.println("String data of s1 & s2  are not same");
				}
	}

}
