/*
You're designing a program for a recruitment agency that determines 
whether a candidate is suitable for a job role. 
The program should take years of experience and the candidate's skill level as inputs. 
A candidate is suitable if they have more than 5 years of experience and a skill level above 7. 
If the candidate has the required experience, it should then check their skill level. 
If both conditions are met, it should print "Suitable Candidate".

Sample Input 1: Years of Experience - 6, Skill Level - 8
Sample Output 1: Suitable Candidate
Sample Input 2: Years of Experience - 5, Skill Level - 6
Sample Output 2: 

 */


package com.kn.NestedIf;

import java.util.Scanner;

public class RecruitementAgency {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your Experience: ");
		int Experience = s.nextInt();
		
		System.out.println("Enter your skill level: ");
		int skill = s.nextInt();
		
		boolean match = checkExpSkill(Experience,skill);
		
		if(match == true) {
			System.out.println("Suitable Candidate");
		}
		
		s.close();
	}

	 static boolean checkExpSkill(int exp, int s) {
		 	if(exp >5) {
		 		if(s>7) {
		 			return true;
		 		}
		 		return true;
		 	}else 
		 	{
		 		return false;
		 	}
	 
	 }

}
