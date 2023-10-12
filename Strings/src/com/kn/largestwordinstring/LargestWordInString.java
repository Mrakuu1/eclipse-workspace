package com.kn.largestwordinstring;

public class LargestWordInString {
	//method to find the longest word
	public void largestWord(String s1) {
		
		String[] s2 = s1.split(" ");
		
		String temp ="";
//		StringBuffer temp = new StringBuffer();
		
		for (String i:s2) {
			if(i.length()>(temp.length())) {
				temp = i;
//				temp = new StringBuffer(i);
			}
		}
		
		System.out.println("The longest word = "+temp);
	}
}
