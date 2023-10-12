package com.kn.arrays;

import java.util.Scanner;

public class WhatDataIsAtArrayIndex {

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
		System.out.println("Enter a number to check it is index: ");
		int n = scan.nextInt();

		// creating a method to check the number user entered is present or not
		 isNumberPresentAtIndex(arr, n);
		

		scan.close();
	}

	 static void isNumberPresentAtIndex(int[] arr, int n) {
		 for(int i=0; i<arr.length; i++)
		 {
			 if(n==arr[i])
			 {
				 System.out.println("The number is present at index "+ i);
			 }
		 }
		
	}

}
