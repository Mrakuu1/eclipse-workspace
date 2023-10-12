/*
 
As a part of a traffic management system, 
you are creating a program that determines a person's eligibility for a driving license 
based on their age and eyesight score (out of 10). 
The program should take age and eyesight score as inputs. 
A person is eligible for a driving license if they are at least 18 years old and their eyesight score is 6 or above. 
If both conditions are met, the program should print "Driving License Eligible". 


Sample Input 1: Age - 20, Eyesight Score - 7
Sample Output 1: Driving License Eligible
Sample Input 2: Age - 20, Eyesight Score - 5
Sample Output 2: 

 */

package com.kn.NestedIf;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int Age = s.nextInt();
		
		System.out.println("Eye Sight score (between 1-10): ");
		int Eyesight = s.nextInt();
		
		
		boolean approval = drivingLicenseApproval(Age,Eyesight);
		if(approval == true) {
			System.out.println("Driving License Eligible");
		}else {
			System.out.println("not Eligibe");
		}

		s.close();
	}

	static boolean drivingLicenseApproval(int age, int eyesight) {
		if(age>=18) {
			if(eyesight>=6) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else {
			return false;
		}
	
	}
}