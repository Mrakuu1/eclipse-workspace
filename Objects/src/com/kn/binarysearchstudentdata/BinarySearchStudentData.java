package com.kn.binarysearchstudentdata;

import java.util.Scanner;

public class BinarySearchStudentData {

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
		
		
		System.out.println("Enter the Id to be Searched = ");
		int search = scan.nextInt();
		
		System.out.println();
		System.out.println("Student Data \n==========================================");

		int low = 0;
		int high = srr.length - 1;
		
		boolean isFound = false;
		int mid = 0;
		while(low <= high){
			
			 mid = (low + high)/2;
			
			if(search == srr[mid].id) {
				isFound = true;
				break;
			}else if(srr[mid].id < search) {
				low = mid + 1;
			}else {
				high = mid -1;
			}
			
			
		}
		
		if(isFound) {
			System.out.println("ID = "+srr[mid].id+", Name = "+srr[mid].name+", Marks = "+srr[mid].marks);
		}else {
			System.out.println("ID not found");
		}
		scan.close();
	}

}
