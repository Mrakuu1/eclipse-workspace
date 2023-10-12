package com.kn.arrays;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Size of the array: ");
		//Array Declaration and creation
		int[] arr = new int[scan.nextInt()];
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter "+(i+1)+" Integer: ");
			arr[i] = scan.nextInt();
		}
		
		int sum=0;
		
		//Array Traversing
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("The sum of Entered Integers = "+sum);
		scan.close();
	}

}
