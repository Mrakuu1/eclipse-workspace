package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Array Declaration and creation
		System.out.println("Enter the size of array: ");
		int[] arr = new int[scan.nextInt()];

		// Array initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + (i + 1) + " : ");
			
			//user enters the elements to store in array index
			arr[i] = scan.nextInt();
		}

		//Object creation to calculate sum of array elements
		SumOfElements sumOfElements = new SumOfElements();
		
		
		System.out.println("=====================================");
		System.out.println("The total sum of array elements are: ");
		System.out.println(sumOfElements.printSumofElements(arr));
		
		// Scanner close
		scan.close();
	}

}
