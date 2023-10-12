/*
 You are creating a game where players choose their characters 
based on characteristics associated with Zodiac signs. 
The program should take a Zodiac sign as input and print the characteristic associated with that Zodiac sign. 
Consider the following characteristics: Aries - Adventurous, Taurus - Dependable, Gemini - Expressive, 
Cancer - Intuitive, Leo - Passionate, Virgo - Analytical, Libra - Diplomatic, Scorpio - Determined, 
Sagittarius - Philosophical, Capricorn - Organized, Aquarius - Original, Pisces - Compassionate.

Sample Input 1: Aries
Sample Output 1: Adventurous

Sample Input 2: Virgo
Sample Output 2: Analytical
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Zodiac Sign : ");

		String sign = s.nextLine();

		characterAssociated(sign);
		s.close();
	}

	static void characterAssociated(String sign) {
		switch (sign) {
		case "Aries":
			System.out.println("Adventurous");
			break;
		case "Taurus":
			System.out.println("Dependable");
			break;
		case "Gemini":
			System.out.println("Expressive");
			break;
		case "Cancer":
			System.out.println("Intuitive");
			break;
		case "Leo":
			System.out.println("Passionate");
			break;
		case "Virgo":
			System.out.println("Analytical");
			break;
		case "Libra":
			System.out.println("Diplomatic");
			break;
		case "Scorpio":
			System.out.println("Determined");
			break;
		case "Sagittarius":
			System.out.println("Philosophical");
			break;
		case "Capricorn":
			System.out.println("Organized");
			break;
		case "Aquarius":
			System.out.println("Original");
			break;
		case "Pisces":
			System.out.println("Compassionate");
			break;
		default:
			System.out.println("enter valid zodiac sign");
			break;
		}
	}

}
