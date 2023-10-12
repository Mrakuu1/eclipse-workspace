package com.kn.uniquecharacter;

public class UniqueChar {
	public void uniqueCharacters(String s1) {
		char[] crr = s1.toCharArray();

		for (int i = 0; i < crr.length; i++) {
			int count = 0;
			for (int j = 0; j < crr.length; j++) {
				if (crr[i] == crr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(crr[i]);
			}
		}

	}
}
