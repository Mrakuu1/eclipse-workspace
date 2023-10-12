package com.kn.reversewithoutreplacingspace;

public class ReverseWithoutReplacingSpace {

	public void reverseWithoutReplacingSpace(String inputString) {
		
		char[] crr = inputString.toCharArray();
		
		char[] rev = new char[crr.length];
		
		
		for(int i=0; i<crr.length; i++) {
			if(crr[i]==' ') {
			 rev[i] = crr[i];
			}
			
		}
			
		int j= crr.length-1;
		for(int i=0; i<crr.length; i++) {
			if(crr[i] !=' ') {
				if(rev[j]==' ') {
					j--;
				}
				rev[j] = crr[i];
				j--;
			}
		}

		System.out.println(rev);
		
	}

}


//i am learning java