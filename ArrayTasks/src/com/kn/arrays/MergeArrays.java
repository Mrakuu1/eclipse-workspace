package com.kn.arrays;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter arr size: ");
		int[] arr = new int[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter arr Element " + (i + 1) + ": ");
			arr[i] = scan.nextInt();
		}

		System.out.println("Enter brr size: ");
		int[] brr = new int[scan.nextInt()];

		for (int i = 0; i < brr.length; i++) {
			System.out.println("Enter brr Element " + (i + 1) + ": ");
			brr[i] = scan.nextInt();
		}
		
		System.out.println("Enter crr size: ");
		int[] crr = new int[scan.nextInt()];

		for (int i = 0; i < crr.length; i++) {
			System.out.println("Enter crr Element " + (i + 1) + ": ");
			crr[i] = scan.nextInt();
		}

		
		ArrayAfterMerging mergeArray = new ArrayAfterMerging();
		mergeArray.mergeTwoArrays(arr, brr, crr);
		
		scan.close();
	}

}
