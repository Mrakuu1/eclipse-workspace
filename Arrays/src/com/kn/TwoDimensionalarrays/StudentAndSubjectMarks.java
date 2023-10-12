package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class StudentAndSubjectMarks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter Number of Students ");
		int students = scan.nextInt();

		System.out.println("Enter Number of Subjects ");
		int subjects = scan.nextInt();

		int[][] arr = new int[students][subjects];

		// Array Initialization for Number of students
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Student " + (i + 1) + " data to store: ");

			// Array Initialization for Number of subjects
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Subject " + (j + 1) + " marks: ");
				arr[i][j] = scan.nextInt();
			}
		}

		// displaying Students data
		for (int i = 0; i < arr.length; i++) {
			System.out.println("=========== Student " + (i + 1) + " =========== ");
			
			// displaying subject marks
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.println("Subject " + (j + 1) + " marks: " + arr[i][j]);
							
			}
			
			
			scan.close();
		}

	}

}
