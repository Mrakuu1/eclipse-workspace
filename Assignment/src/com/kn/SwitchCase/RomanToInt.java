/*
 As part of a game, you're creating a feature that takes a Roman numeral as input 
and returns the corresponding decimal number. The Roman numerals from 1 to 5 are I, II, III, IV, V.

Sample Input 1: 'I'
Sample Output 1: 1
Sample Input 2: 'IV'
Sample Output 2: 4
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class RomanToInt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Roman Number: ");
		
		String roman = s.nextLine();
		
			
		romanToInt(roman);
		s.close();
	}

	static void romanToInt(String roman) {
		
		switch(roman) {
		case "I":
			System.out.println("1");
			break;
		case "II":
			System.out.println("2");
			break;
		case "III":
			System.out.println("2");
			break;
		case "IV":
			System.out.println("4");
			break;
		case "V":
			System.out.println("5");
			break;
		}
	}

}

