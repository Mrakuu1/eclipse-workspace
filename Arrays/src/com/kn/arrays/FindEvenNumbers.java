package com.kn.arrays;

import java.util.Scanner;

public class FindEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Size of the array: ");
		// Array Declaration and creation
		int[] arr = new int[scan.nextInt()];

		// Array Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " Integer: ");
			arr[i] = scan.nextInt();
		}

		
		System.out.println("Even Integers are: ");
		// Array Traversing
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+ " is Even");
			}
		}

		
		scan.close();
	}

}
