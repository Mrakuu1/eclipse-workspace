/*
You're creating a program for a community center that categorizes individuals based on their age for different activities. 
The program should accept an age as input. 
For age between 0 and 12, it should print "Child". 
For age between 13 and 19, it should print "Teen". 
For age between 20 and 59, it should print "Adult". 
For age 60 and above, it should print "Senior Citizen".

Sample Input 1: 6
Sample Output 1: Child
Sample Input 2: 30
Sample Output 2: Adult
 */


package com.kn.elseifladder;

import java.util.Scanner;

public class CategorizeAge {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Age : ");
		
		int age = s.nextInt();
		
		individualsAge(age);
		
		s.close();
	}
	static void individualsAge(int age) {
		if(age>=0 && age<=12) 
		{
			System.out.println("Child");
		}
		else if(age>=13 && age<=19) 
		{
			System.out.println("Teen");
		}
		else if(age>=20 && age<=59) 
		{
			System.out.println("Adult");
		}
		else if(age>=60) 
		{
			System.out.println("Senior Citizen");
		}
	}
}
