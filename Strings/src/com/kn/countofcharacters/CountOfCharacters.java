package com.kn.countofcharacters;

public class CountOfCharacters {
	public void countOfCharacters(String s1,char c) {
		char[] crr = s1.toCharArray();
		
		
		int count = 0;
		
		for(int i=0; i<crr.length; i++) {
			
				if(crr[i]==c) 
				{
				count++;
				}
			
		}
		
		System.out.println("The count of the give character in given string = "+count);
		
	}

}
