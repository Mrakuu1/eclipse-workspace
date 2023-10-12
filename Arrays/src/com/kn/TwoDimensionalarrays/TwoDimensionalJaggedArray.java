package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class TwoDimensionalJaggedArray {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			
		//Array Declaration	
		int[][] arr;
		
		//taking user input to store number of data 
		System.out.println("Enter how many data to store: ");
		int data = scan.nextInt();
		
		//Storing Base value
		arr = new int[data][];
		
		//traversing to take user input to store number of elements 
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter how many elements to be stored in "+(i+1) +" element ");
			int ele = scan.nextInt();
			
			//Storing 2D value
			arr[i] = new int[ele];
		}
		
		
		
		//Array Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter data"+(i+1)+" to store");
			
			for(int j=0; j< arr[i].length; j++) {
				System.out.println("Enter element "+(j+1));
				arr[i][j]= scan.nextInt();
			}
		}
		//Array Traversing
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("The data stored  in "+(i+1)+" are ");
			
			for(int j=0; j< arr[i].length; j++) {
				System.out.println(arr[i][j]);
				
			}
		}
		
		scan.close();
		}
}