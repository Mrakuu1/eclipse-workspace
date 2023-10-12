/*

You're designing an application for space enthusiasts that provides information about the solar system. 
The application should take a planet's name as input and outputs its order from the Sun. 
Consider the order: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune, Pluto.

Sample Input 1: Earth
Sample Output 1: 3

Sample Input 2: Mars
Sample Output 2: 4
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class SolarSytem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Planet to check its Position from SUN : ");

		String plane = s.nextLine();

		isAtPosition(plane);
		s.close();
	}

	static void isAtPosition(String planet) {
		switch (planet) {
		case "Mercury":
			System.out.println("1");
			break;
		case "Venus":
			System.out.println("2");
			break;
		case "Earth":
			System.out.println("3");
			break;
		case "Mars":
			System.out.println("4");
			break;
		case "Jupiter":
			System.out.println("5");
			break;
		case "Saturn":
			System.out.println("6");
			break;
		case "Uranus":
			System.out.println("7");
			break;
		case "Neptune":
			System.out.println("8");
			break;
		case "Pluto":
			System.out.println("9");
			break;
		default:
			System.out.println("Only 9 planets ");
			break;
		}
	}

}
