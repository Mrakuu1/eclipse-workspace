package com.kn.arrays;

import java.util.Scanner;

public class CountOfPositiveAndNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array declaration and creation
		System.out.println("Enter the Size of the Array: ");
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data " + (i + 1) + "  to store: ");
			arr[i] = scan.nextInt();
		}

		// creating a method to find number is positive or negative

		int ptotal = findPositiveNumbers(arr);
		System.out.println(ptotal + " Positive numbers are present");

		int ntotal = findNegativetiveNumbers(arr);
		System.out.println(ntotal + " Negative numbers are present");

		scan.close();

	}

	// Method to find Number is Positive
	static int findPositiveNumbers(int arr[]) {

		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos++;
			}

		}
		return pos;

	}

	// Method to find Number is Negative
	private static int findNegativetiveNumbers(int[] arr) {
		int neg = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				neg++;
			}
		}
		return neg;
	}

}
