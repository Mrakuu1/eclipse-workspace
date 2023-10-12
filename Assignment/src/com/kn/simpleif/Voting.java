/*
   Your task is to create a program for a voting registration system. 
   According to the law, a person is eligible to vote if their age is 18 or above.
   Your Java program should accept a person's age as input. If the age is 18 or above, 
   the program should print "Voter registration eligible".
Sample Input 1: 21
Sample Output 1: Voter registration eligible
Sample Input 2: 17
Sample Output 2:
 */

package com.kn.simpleif;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		
		int age = s.nextInt();
		
		boolean Result = isGreater(age);
		if(Result == true) {
			System.out.println("Voter registration eligible");
		}
		s.close();
	}

	private static boolean isGreater(int age) {
		if(age>18) {
			return true;
		}else {
			return false;
		}
	}

}


/*
 Enter your Age: 
19
Voter registration eligible

Enter your Age: 
16


 */
