package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class NumberOfFriendUsingJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration & creation by taking user input to store number of Batches
		System.out.println("Enter Number of Batches : ");

		// Storing Base value
		String[][] arr = new String[scan.nextInt()][];

		// Array traversing to take user input to store number of Friends
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter how many Friends in " + (i + 1) + " batch ");

			// Storing 2D value
			arr[i] = new String[scan.nextInt()];
		}

		// Array Initialization to store Batch & Friends name
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Batch A" + (i + 1) + " friends name: ");

			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = scan.next();

			}
		}

		System.out.println("==============================================");
		// Array Traversing to print Batch & Friends name

		for (int i = 0; i < arr.length; i++) {
			System.out.println("=====Friends in Batch A" + (i + 1) + " ======");

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j]);

			}
		}

		scan.close();
	}

}
