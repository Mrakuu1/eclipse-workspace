package com.kn.studentapp;

import java.util.Scanner;

public class StudentApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of students objects to be entered");
		Student[] srr = new Student[scan.nextInt()];
		
		
		for(int i=0; i<srr.length;i++) {
			
			System.out.println("Enter ID for Student "+(i+1));
			int id = scan.nextInt();
			
			System.out.println("Enter Name for Student "+(i+1));
			String name = scan.next();
			
			System.out.println("Enter Marks for Student "+(i+1));
			int marks = scan.nextInt();
			
			srr[i] = new Student(id, name, marks);
		}
		
		System.out.println("========================================================================");
		StudentUtility su = new StudentUtility();
		
		System.out.println("Enter Id to search Student data");
		int searchID = scan.nextInt();
		su.searchByID(srr, searchID);
		
		System.out.println("========================================================================");
		
		System.out.println("Enter Name to search Student data");
		String searchName = scan.next();
		su.searchByName(srr,searchName);
		
		System.out.println("========================================================================");
		
		System.out.println("Sort Student data based on marks : \n");
		su.sortByMarks(srr);
		
		System.out.println("========================================================================");
		
		System.out.println("Apply grace");
		su.applyGrace(srr);
		
		System.out.println("========================================================================");
		
		System.out.println("Rate Application(1-5)");
		int num = scan.nextInt();
		su.rateApplication(num);
	
		scan.close();
	}

}
