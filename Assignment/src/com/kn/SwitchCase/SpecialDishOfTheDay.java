/*
 You're developing a restaurant app which helps the customers to know the special dish of the day. 
The application should take a day of the week as input (1 for Monday, 2 for Tuesday, etc.) and 
outputs the special dish of that day. Consider the following dishes: Monday - Pasta, Tuesday - Tacos,
 Wednesday - Sushi, Thursday - Steak, Friday - Pizza, Saturday - Lobster, Sunday - Brunch.

Sample Input 1: 1
Sample Output 1: Pasta
Sample Input 2: 5
Sample Output 2: Pizza
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class SpecialDishOfTheDay {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number from 1-7(Monday-Sunday) to display Special Dish of the day: ");

		int day = s.nextInt();

		specialDishForTheDay(day);

		s.close();
	}

	static void specialDishForTheDay(int day) {
		switch (day) {
		case 0:
			System.out.println("Enter Valid number");
			break;
		case 1:
			System.out.println("------------Monday---------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Pasta*****");
			break;
		case 2:
			System.out.println("-----------Tuesday--------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Tacos*****");
			break;
		case 3:
			System.out.println("------------Wednesday------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Sushi*****");
			break;
		case 4:
			System.out.println("------------Thursday-------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Steak*****");
			break;
		case 5:
			System.out.println("-------------Friday------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Pizza*****");
			break;
		case 6:
			System.out.println("-----------Saturday--------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Lobster*****");
			break;
		case 7:
			System.out.println("-----------Sunday--------------");
			System.out.println("<<<<<Special dish of the Day >>>>> \n\n *****Brunch*****");
			break;

		default:
			System.out.println("There are Only 7days in a week");
			break;
		}

	}
}
