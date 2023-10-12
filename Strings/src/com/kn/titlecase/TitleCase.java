package com.kn.titlecase;

public class TitleCase {
	public void toUpperCase(String inputString) {

		StringBuffer sb = new StringBuffer();
		// using split method to split the string
		String[] s1 = inputString.split(" ");

		for (int i = 0; i < s1.length; i++) {
			// converting the string to char array
			char[] crr = s1[i].toCharArray();

			for (int j = 0; j < 1; j++) {
				// validating Upper case or Lower case
				if (crr[0] >= 97 && crr[0] <= 122) {
					crr[0] = (char) (crr[0] - 32);
				}
//				System.out.print(crr[j]);
			}
//			System.out.print(" ");
			for(char c:crr) {
				sb.append(c);
			}sb.append(" ");
			
			
		}
		System.out.println(sb);
	}

}
