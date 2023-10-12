/*
 As part of a calendar application, you are creating a feature that displays the number of days in a month. 
The program should take a month number (1 for January, 2 for February, and so on till
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("1.January \n2.February \n3.March \n4.April \n5.May \n6.June"
				+ "\n7.July \n8.August \n9.September \n10.October \n11.November \n12.December");
		System.out.println("Enter a key to check Number of days present in Month in a Month: ");

		int key = s.nextInt();

		numberOfDaysinMonth(key);
		s.close();
	}

	static void numberOfDaysinMonth(int key) {
		switch (key) {
		case 0:
			System.out.println("Enter Valid number");
			break;
		case 1:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 3:
			System.out.println("31");
			break;
		case 4:
			System.out.println("30");
			break;
		case 5:
			System.out.println("31");
			break;
		case 6:
			System.out.println("30");
			break;
		case 7:
			System.out.println("31");
			break;
		case 8:
			System.out.println("31");
			break;
		case 9:
			System.out.println("30");
			break;
		case 10:
			System.out.println("31");
			break;
		case 11:
			System.out.println("30");
			break;
		case 12:
			System.out.println("31");
			break;

		default:
			System.out.println("Only 12 months are there Year");
			break;
		}
	}

}
