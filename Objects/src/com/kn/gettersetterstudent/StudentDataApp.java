package com.kn.gettersetterstudent;

import java.util.Scanner;

public class StudentDataApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		StudentData s1 = new StudentData(1, "Akash", 88, "MALE");
		
		System.out.println("Rollno = "+ s1.getRollnumber());
		System.out.println("Name  = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Gender = "+s1.getGender());
		
		System.out.println("=========================================");
		System.out.println("Modified Student data");
		System.out.println("=========================================");
		
		s1.setRollnumber(123);
		s1.setName("Sanjay");
		s1.setMarks(77);
		s1.setGender("Male");
		
		System.out.println("Rollno = "+ s1.getRollnumber());
		System.out.println("Name  = "+s1.getName());
		System.out.println("Marks = "+s1.getMarks());
		System.out.println("Gender = "+s1.getGender());
		
		
		scan.close();
	}

}
