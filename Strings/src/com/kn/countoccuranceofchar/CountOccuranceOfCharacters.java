package com.kn.countoccuranceofchar;

public class CountOccuranceOfCharacters {
	
	public void countOccuranceOfChar(String inputString){
		
		
			// converting String value to character array
			char[] crr = inputString.toCharArray();
			
			crr = sortArrayChar(crr);
			
			int count =1;
		
			for(int j=0 ; j< crr.length-1; j++) {
				
				if( (j+1) == crr.length-1) {
					if(crr[j+1]==crr[j]) {
						count++;
					}else {
						System.out.println(crr[j]+" = " +count);
						count=1;
						System.out.println(crr[j+1] +" = "+ count);
					}
					
					
				}
				
			}
		
			
			
	}
	
	// method to sort the Array elements
		public char[] sortArrayChar(char[] crr) {

			for (int i = 0; i < crr.length; i++) {

				for (int j = 0; j < crr.length - 1 - i; j++) {
					// initially storing char as temp
					char temp = 0;

					// Comparing arrayChar elements
					if (crr[j] > crr[j + 1]) {

						// swapping CharArray elements
						temp = crr[j];
						crr[j] = crr[j + 1];
						crr[j + 1] = temp;

					}
				}

			}
			return crr;

		}

}
