/*
 
You're working on a calendar application that provides users with interesting facts about years. 
The program should first check if the input year is a leap year. 
If it is, the program should further check if it belongs to the 21st century. 
If both conditions are true, it should print "21st Century Leap Year". 
If only the first condition is true, it should print "Leap Year". 

Sample Input 1: 2024
Sample Output 1: 21st Century Leap Year
Sample Input 2: 1996
Sample Output 2: Leap Year
 */

package com.kn.NestedIf;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int Year = s.nextInt();
		
		leapOrNot(Year);
		
		s.close();
	}
	static void leapOrNot(int year) {
		if((year%400 == 0) ||  ((year%4 == 0) && (year%100 != 0)))
		{		
			if(year>=2000 && year <= 2100)
			{
				System.out.println("21st Centuary Leap Year");
			}else 
			{
				System.out.println("Leap Year");
			}
		}
		else {
			System.out.println("Non Leap Year");
		}
	}
}
