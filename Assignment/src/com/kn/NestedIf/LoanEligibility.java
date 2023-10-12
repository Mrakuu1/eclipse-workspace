/*
You are creating a program for a loan approval system. 
The eligibility for a loan is based on both age and income. 
A person is eligible if they are at least 18 years old and their annual income is over $40,000. 
Write a Java program that accepts age and income as input. 
If both conditions are met, the program should print "Loan Approved". 

Sample Input 1: Age - 22, Income - 50000
Sample Output 1: Loan Approved
Sample Input 2: Age - 22, Income - 30000
Sample Output 2: 
 */

package com.kn.NestedIf;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int Age = s.nextInt();
		
		System.out.println("Enter your Salary: ");
		int Salary = s.nextInt();
		
		boolean approval = isAgeSalary(Age,Salary);
		if(approval == true) {
			System.out.println("Loan Approved");
		}else {
			System.out.println("not Eligibe");
		}

		s.close();
	}

	static boolean isAgeSalary(int age, int salary) {
		if(age>=18) {
			if(salary>40000) 
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
