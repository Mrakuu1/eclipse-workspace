package com.kn.arrays;

import java.util.Scanner;

public class NumbersDivisibleBy3 {

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

		
		// creating a method to check the number user entered is divisible by 3 or not
		isNumberDivisivleBy3(arr);

		scan.close();
	}

		//method to check the number user entered is divisible by 3 or not
		static void isNumberDivisivleBy3(int[] arr) {
			
			System.out.println("Numbers that are divisible by 3 are: ");
			
			for(int i=0;i<arr.length; i++) {
				
				//number stored in array are divided by 3
				if(arr[i]%3 ==0) 
				{
					
					//numbers which are divisible by 3 are printed
					System.out.println(arr[i]);
					
				}
			}
	}

}
