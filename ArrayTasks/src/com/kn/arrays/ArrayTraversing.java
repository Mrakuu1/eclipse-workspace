package com.kn.arrays;

public class ArrayTraversing {
	// Method to print the array elements
	public void printArrayElementsinForward(int[] arr) {

		System.out.println("===========================");
		System.out.println("The Array elemnts are : ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Method to print the array elements in reverse
	public void printArrayElementsinReverse(int[] arr) {

		System.out.println("===========================");
		System.out.println("The Array elemnts in reverse order are : ");
		for (int i = arr.length-1; i >-1; i--) {

			System.out.print(arr[i] + " ");
		}
	}
}
