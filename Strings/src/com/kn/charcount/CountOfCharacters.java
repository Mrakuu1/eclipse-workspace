package com.kn.charcount;

public class CountOfCharacters {

		public void countOfChar(String inputString) {
			
			int ucv =0;
			int ucc =0;
			
			int lcv =0;
			int lcc =0;
			int digit =0;
			int space = 0;
			int spc = 0;
			
			char[] crr = inputString.toCharArray();
			
			for (int i = 0; i < crr.length; i++) {
				if (crr[i] >= 65 && crr[i] <= 90) {
					if(crr[i]=='A'|| crr[i]=='E'|| crr[i]=='I'|| crr[i]=='O'|| crr[i]=='U')
					{
					ucv++;
					}	
					else 
					{
					ucc++;
					}
				} else if (crr[i] >= 97 && crr[i] <= 122) {
					if(crr[i]=='a'|| crr[i]=='e'|| crr[i]=='i'|| crr[i]=='o'|| crr[i]=='u')
					{
					lcv++;
					}	
					else 
					{
					lcc++;
					}
				} else if(crr[i]>=48 && crr[i]<=57) {
					digit++;
				} else if(crr[i]==32){
					space++;
				}else {
					spc++;
				}
			}
			System.out.println("UpperCaseCons = "+ucc);
			System.out.println("UpperCaseVowel = "+ucv);
			System.out.println("LowerCaseCons = "+lcc);
			System.out.println("LowerCaseVowel = "+lcv);
			System.out.println("digit = "+digit);
			System.out.println("space = "+space);
			System.out.println("Special Character = "+spc);		
		}
}


//crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'o' || crr[i] == 'u'