package com.kn.anagramstring;

public class AnagramLength {
	//method to check Anagram length
	public boolean anagramLength(String s1, String s2) {
		// converting String value to character array
		char[] crr1 = s1.toCharArray();
		char[] crr2 = s2.toCharArray();

		boolean isAnagram = false;
		// validating length of charArrays
		if (crr1.length == crr2.length) {
			// calling method to sort the given charArray
			crr1 = sortArrayChar(crr1);
			crr2 = sortArrayChar(crr2);

			for (int i = 0; i < crr1.length; i++) {
				// comparing charArray are same or not
				if (crr1[i] == crr2[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
				}
			}
		}

		return isAnagram;

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
