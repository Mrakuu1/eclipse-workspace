package com.kn.reversestring;

public class ReverseString {
	public void reverseString(String inputString) {

		// using split method to split the string
		String[] s1 = inputString.split(" ");

		for (int i = 0; i < s1.length; i++) {
			// converting the string to char array
			char[] crr = s1[i].toCharArray();

			for (int j = crr.length - 1; j >= 0; j--) {
				System.out.print(crr[j]);
			}
			System.out.print(" ");
		}

	}
}
