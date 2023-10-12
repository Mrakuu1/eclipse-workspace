package com.kn.arrays;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of the array");
		
		//Array declaration and creation
		int[] arr = new int[scan.nextInt()];

		System.out.println("----------------------");
		System.out.println("Enter Array elements ");
		System.out.println("----------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + (i + 1) + " :");
			
			//Array initialization
			arr[i] = scan.nextInt();

		}
		System.out.println();
		
		
	
		System.out.println("Array elements Before sorting");
	
		for (int i = 0; i < arr.length; i++) {
			//printing elements before sorting
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	

		//creating  object to swap numbers
		InsertionSort sort = new InsertionSort();
		
		
		
		System.out.println();
		
		System.out.println("Array elements after sorting");
		
		for (int i = 0; i < arr.length; i++) {
			
			//calling method from SortArrayElements and printing the elements after sorting 
			System.out.print(sort.sortArrayElements(arr)[i]+ " ");
			
		}
		System.out.println();
		
		
		scan.close();
	}

}
