/*
You are creating a program for a learning management system that checks the performance of a student in three tests. 
The program should accept scores of three tests. 
If all the scores are above 50, it should print "Passed All". 
If not, and if the average score is above 50, it should print "Average Score Passed". 

Sample Input 1: Test 1 Score - 60, Test 2 Score - 70, Test 3 Score - 80
Sample Output 1: Passed All
Sample Input 2: Test 1 Score - 40, Test 2 Score - 60, Test 3 Score - 70
Sample Output 2: Average Score Passed
 */

package com.kn.NestedIf;

import java.util.Scanner;

public class LearningManagementSystem {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your Test1 Marks : ");
		int test1 = s.nextInt();
		
		System.out.println("Enter your Test2 Marks : ");
		int test2 = s.nextInt();
		
		System.out.println("Enter your Test1 Marks : ");
		int test3 = s.nextInt();
		
		boolean result = avgOfTest(test1,test2,test3);
		if(result==true) {
		System.out.println("Passed");
		}else {
			System.out.println("Average Score Passed");
		}
		s.close();
}

	 static boolean avgOfTest(int test1, int test2, int test3) {
		 if(test1>50 && test2>50 && test3>50) 
		 {
			 return true;
			 
		 }else {
			 if(((test1+test2+test3)/3)>50) {
				 return true;
			 }
			 return false;
	 }
	 }

}
