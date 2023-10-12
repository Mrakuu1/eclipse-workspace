package com.kn.userinputstudentdata;

import java.util.Scanner;

public class StudentDemo {

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
		
		System.out.println();
		System.out.println("Student Data \n==========================================");
		
		for(int i=0; i<srr.length; i++) {
			System.out.println("Id = "+srr[i].id +",Name = "+srr[i].name+", Marks = "+srr[i].marks);
		}
		
		scan.close();
	}

}
