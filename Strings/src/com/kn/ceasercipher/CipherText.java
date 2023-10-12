package com.kn.ceasercipher;

public class CipherText {
	// method to convert the string to cipher text
	public String cipherText(String inputString, int n) {

		// creating a stringBuffer Object
		StringBuffer buffer = new StringBuffer();

		// converting string to charAray
		char c[] = inputString.toCharArray();
		
		while(n>26) {
			n = n-26;
		}

		// encrypting the charArray
		for (int i = 0; i < c.length; i++) {
			// validating the charArray
			if (c[i] >= 65 && c[i] <= 90 - n) {
				c[i] = (char) (c[i] + n );
			} else if (c[i] >= 97 && c[i] <= 122 - n) {
				c[i] = (char) (c[i]+ n );
			} else {
				c[i] = (char)((c[i] + n )-26 );
			}

			buffer.append(c[i]);
		}
		return buffer.toString();

	}

}
