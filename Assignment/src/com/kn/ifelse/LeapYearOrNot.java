/*  You are creating a program for a calendar application. 
	The application should be able to identify leap years. 
	Your Java program should take a year as input and if the year is a leap year, 
	the program should print "Leap Year". Otherwise, it should print "Non-Leap Year".


Sample Input 1: 2028
Sample Output 1: Leap Year
Sample Input 2: 2021
Sample Output 2: Non-Leap Year  */

package com.kn.ifelse;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year to find Leap year or not: ");
		
		int year = s.nextInt();
		
		boolean leapyear = isLeapYear(year);
		
		if(leapyear  == true)  {
			System.out.println("Leap Year");
		}else {
			System.out.println("Non-Leap Year");
		}
		s.close();
	}

	 static boolean isLeapYear(int year) {
		if((year%400 == 0) ||  ((year%4 == 0) && (year%100 != 0))){
			return true;
		}else {
			return false;
		}
	}

}




/*

Enter the year to find Leap year or not: 
2028
Leap Year


Enter the year to find Leap year or not: 
2021
Non-Leap Year


 */
