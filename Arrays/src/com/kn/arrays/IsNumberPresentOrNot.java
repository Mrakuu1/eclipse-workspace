package com.kn.arrays;

import java.util.Scanner;

public class IsNumberPresentOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array Declaration and Creation
		System.out.println("Enter the Size of the Array: ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data " + (i + 1) + " to store: ");
			arr[i] = scan.nextInt();
		}

		// take a user input to check number is present or not
		System.out.println("Enter a number to check it is present or not: ");
		int n = scan.nextInt();

		// creating a method to check the number user entered is present or not
		boolean result = isNumberPresent(arr, n);
		if (result == true) {
			System.out.println(n + " is present ");
		} else {
			System.out.println(n + " is not present");
		}

		scan.close();
	}

	// Verifying whether the number is present or not
	static boolean isNumberPresent(int[] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			// if the given number is stored in array or not

			if (n == arr[i]) {

				// if number is present
				return true;
			}

		}
		// if number not present
		return false;
	}

}
