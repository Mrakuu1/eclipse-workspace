package com.kn.nonrepeatingchar;

public class NonRepeatingChar {

	public void nonRepeatingChar(String inputString) {
		char[] crr = inputString.toCharArray();

		for (int i = 0; i < crr.length; i++) {
			int count = 0;
			for (int j = 0; j < crr.length ; j++) {

				if (crr[i] == crr[j]) {
					count++;
				}

			}
			if (count == 1) {
				System.out.println(crr[i]);
				break;
			}

		}

	}

}
