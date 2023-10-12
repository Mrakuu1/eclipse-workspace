package com.kn.strings;

public class StringComparison2 {

	public static void main(String[] args) {
		
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram" + "Sita";
		String s4 = "Ram" + "Sita";
		
		String s5 = s1 + s2;
		String s6 = s1 + s2;
		
		
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
		
		System.out.println();
		
		
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
		
		System.out.println();
		
		if(s5==s6) {
			System.out.println("Refrence of s5 & s6 are pointing to same object");
		}else {
			System.out.println("Refrence of s5 & s6 are pointing to different object");
		}
		
		
		if(s5.equals(s6)) {
			System.out.println("String data of s5 & s6 are same");
		}else {
			System.out.println("String data of s5 & s6  are not same");
		}
		
	}

}
