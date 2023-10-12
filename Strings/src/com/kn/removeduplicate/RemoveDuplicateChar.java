package com.kn.removeduplicate;

public class RemoveDuplicateChar {
	public void removeDuplicates(String s1) {
		char[] crr = new char[s1.length()];
		
		int k=0;
		for(int i=0; i<s1.length();i++) {
			boolean isPresent = false;
			for(int j=0; j<crr.length;j++) {
				if(s1.charAt(i)==crr[j]) {
					isPresent = true;
				}
			}
			if(!isPresent) {
				crr[k]=s1.charAt(i);
				k++;
			}
		}
		
		System.out.println(crr);
	}
}
