/*  You are creating a program for a luxury hotel. 
	The hotel provides senior citizens a special discount on room bookings. 
	The program should take age as input. If the age is 60 or above, 
	the program should print "Senior Citizen Discount Applicable". Otherwise, 
	it should print "Regular Charges Applicable".
	
Sample Input 1: 65
Sample Output 1: Senior Citizen Discount Applicable
Sample Input 2: 45
Sample Output 2: Regular Charges Applicable */

package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		
		int age=s.nextInt();
		
		boolean result = seniorAge(age);
		
		if(result == true) {
			System.out.println("Senior Citizen Discount Applicable");
		}else {
			System.out.println("Regular Charges Applicable");
		}
		s.close();
		
	}

	 static boolean seniorAge(int age) {
		if(age>=60) {
			return true;
		}else {
			return false;
		}
	}

}



/*
 Enter your age: 
65
Senior Citizen Discount Applicable

Enter your age: 
45
Regular Charges Applicable


 */
