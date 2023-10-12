/*
 	Imagine you're designing the software for a new extreme roller coaster ride in an amusement park. 
The roller coaster has an age restriction - only individuals 12 years or older are allowed on the ride. 
Your program should take as input the age of a visitor. If the age is 12 or above, the program should print "Ride access granted".

Sample Input 1: 15
Sample Output 1: Ride access granted
Sample Input 2: 9
Sample Output 2: 
 */




package com.kn.simpleif;

import java.util.Scanner;

public class RollerCoaster {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your AGE: ");
		byte age = s.nextByte();

		boolean res = checkAge(age);
		if (res == true) {
			System.out.println("Ride access granted");
		}
		s.close();
	}

	static boolean checkAge(byte age) {
		if (age >= 12) {
			return true;
		} else {
			return false;
		}
	}

}




/*
 Enter your AGE: 12
Ride access granted

Enter your AGE: 7



 */

