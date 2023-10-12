package com.kn.arrays;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// array Declaration and creation
		int[] arr = new int[5];
		
		//scanner to take input from user
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter Data to store");
		
		//array initialization
		arr[0]= scan.nextInt();
		arr[1]= scan.nextInt();
		arr[2]= scan.nextInt();
		arr[3]= scan.nextInt();
		arr[4]= scan.nextInt();
		
		//arrays traversing
		System.out.println("After Creation: ");
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		scan.close();
	}

}
