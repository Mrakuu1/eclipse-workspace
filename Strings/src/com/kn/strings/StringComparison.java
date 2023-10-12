package com.kn.strings;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Boss";
		String s2 = "Boss";
		
		if(s1==s2) {
			System.out.println("Refrence of s1 & s2 are pointing to same object");
		}else {
			System.out.println("Refrence of s1 & s2 are pointing to different object");
		}
		
		
		if(s1.equals(s2)) {
			System.out.println("String data of s1 & s2 object are same");
		}else {
			System.out.println("String data of s1 & s2 object are not same");
		}
		
		System.out.println();
		
		String s3 = new String("Boss");
		String s4 = new String("Boss");;
		
		if(s3==s4) {
			System.out.println("Refrence of s3 & s4 are pointing to same object");
		}else {
			System.out.println("Refrence of s3 & s4 are pointing to different object");
		}
		
		
		if(s3.equals(s4)) {
			System.out.println("String data of s3 & s4 object are same");
		}else {
			System.out.println("String data of s3 & s4 object are not same");
		}
	}

}
