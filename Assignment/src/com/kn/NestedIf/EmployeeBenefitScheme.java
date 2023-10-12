/*
 You're designing a program for an employee benefits scheme. 
The program should check whether an employee is eligible for a bonus 
based on their years of service and monthly targets met. 
The program should take years of service and monthly targets met as inputs. 
An employee is eligible for a bonus if they have more than 3 years of service and 
have met more than 6 monthly targets. If eligible, it should print "Bonus Eligible".

Sample Input 1: Years of Service - 4, Monthly Targets Met - 7
Sample Output 1: Bonus Eligible

Sample Input 2: Years of Service - 3, Monthly Targets Met - 6
Sample Output 2: 

 */

package com.kn.NestedIf;

import java.util.Scanner;

public class EmployeeBenefitScheme {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Year's of Service : ");
		int service = s.nextInt();

		System.out.println("Enter your monthly targets from 1-10: ");
		int target = s.nextInt();

		boolean approval = isBenfitOrNot(service, target);
		if (approval == true) {
			System.out.println("Bonus Eligible");
		} else {
			System.out.println("not Eligibe");
		}

		s.close();
	}

	static boolean isBenfitOrNot(int service, int target) {
		if (service > 3) {
			if (target > 6) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}
}
