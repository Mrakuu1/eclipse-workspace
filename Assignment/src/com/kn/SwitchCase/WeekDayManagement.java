/*
 You are developing a weekday management software for a company. 
The program should take a weekday number (1 for Monday, 2 for Tuesday, and so on till 7 for Sunday) 
and print the corresponding day.

Sample Input 1: 5
Sample Output 1: Friday
Sample Input 2: 1
Sample Output 2: Monday
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class WeekDayManagement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number from 1-7 to display corresponding Weekday: ");

		int day = s.nextInt();

		weekDay(day);
		
		s.close();
	}

	static void weekDay(int day) {
		switch (day) {
		case 0:
			System.out.println("Enter Valid number");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("There are Only 7days in a week");
			break;
		}

	}
}
