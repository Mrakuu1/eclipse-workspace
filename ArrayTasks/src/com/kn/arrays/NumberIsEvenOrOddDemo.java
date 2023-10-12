package com.kn.arrays;

import java.util.Scanner;

public class NumberIsEvenOrOddDemo {

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

		// Object Creation to check NumberIsEvenOrOdd
		NumberIsEvenOrOdd numberIsEvenOrOdd = new NumberIsEvenOrOdd();

		// calling method with help of reference object to check numbers are even or odd
		numberIsEvenOrOdd.isNumberEvenOrOdd(arr);

		//Scanner close
		scan.close();
	}

}
