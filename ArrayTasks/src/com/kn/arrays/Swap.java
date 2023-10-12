package com.kn.arrays;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Array declaration and creation
		System.out.println("Enter the size of array : ");
		int[] arr = new int[scan.nextInt()];

		// Array initialization with user input
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the array element " + (i + 1) + " : ");

			// user will enter the elements that to be stored in array index
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter the initial index to change");
		int i1 = scan.nextInt();
		System.out.println("Enter the dest index to where it has to replace");
		int i2 = scan.nextInt();

		System.out.println("Elements bfr swapping: ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}

//		for(int i=0; i<arr.length; i++) {
//			
//		}

		System.out.println();
		System.out.println("After swapping: ");

		int temp = arr[i1];

		arr[i1] = arr[i2];

		arr[i2] = temp;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		
		scan.close();
	}

}
