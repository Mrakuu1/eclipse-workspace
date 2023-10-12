package com.kn.arrays;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Enter the number to search:");
		int num = scan.nextInt();
		
		BinarySearch sBN = new BinarySearch();
		
		sBN.IsNumberPresent(arr, num);
		
		scan.close();
	}

}
