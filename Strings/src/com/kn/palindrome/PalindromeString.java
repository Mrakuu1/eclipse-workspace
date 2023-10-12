package com.kn.palindrome;


public class PalindromeString {
	public boolean palindromeString(String inputString) {
		//creating an object String Buffer to reverse the given string
		StringBuffer outputString = new StringBuffer();
		
		for(int i=inputString.length()-1; i>=0; i--) {
			outputString = outputString.append(inputString.charAt(i));
		}
		
		if(outputString.equals(inputString)) {
			return true;
		}
		return false;
	}
}
