package com.kn.arrays;

import java.util.Scanner;

public class StringInArrays {

	public static void main(String[] args) {
		// Array Declaration
		String[] arr;

		Scanner scan = new Scanner(System.in);

		// Array Creation
		System.out.println("Enter the Size: ");
		arr = new String[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter " + (i + 1) + " String Data =");
			arr[i] = scan.next();

		}
		System.out.println("Array after Entering data: ");
//		 Array Traversing
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//
//		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		scan.close();
	}
}
