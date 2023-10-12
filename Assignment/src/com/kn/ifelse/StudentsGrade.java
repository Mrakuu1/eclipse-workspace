/*  As an IT specialist at a university, 
	you have been tasked to create a program that helps in marking student's grades. 
	The program should take a student's score as an input. 
	If the score is 60 or above, the program should print "Passed". 
	In all other cases, it should print "Failed".  */

package com.kn.ifelse;

import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = s.nextInt();
		
		boolean result = validateMarks(marks);
		
		if(result == true) {
			System.out.println("Passed");
			}else {
			System.out.println("Failed");
			}
		s.close();
		}

	 static boolean validateMarks(int marks) {
		 if(marks>=60) {
			 return true;
		 }else {
			 return false;
		 }
	 }

}


/*
Enter your marks: 
72
Passed

Enter your marks: 
55
Failed


 */
