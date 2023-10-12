package com.kn.patterns;

public class ReverseAlphabetInColumn {

	public static void main(String[] args) {
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >=1; j--) {
				// printing Alphabets row wise(using UniCode of Char)
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();

		}
	}

}
