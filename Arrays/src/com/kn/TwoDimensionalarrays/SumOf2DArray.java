package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
				//Array Declaration	 and creation of 1st dimension
				
				
				//taking user input to store number of data in arr
				System.out.println("Enter how many data to store in arr: ");
								
				int[][] arr= new int[scan.nextInt()][];
				
				//taking user input to store number of data in brr
				System.out.println("Enter how many data to store in brr: ");
				
				int[][] brr= new int[scan.nextInt()][];
				
				//taking user input to store number of data in crr
				System.out.println("Enter how many data to store in crr: ");
				
				int[][] crr= new int[scan.nextInt()][];
				
				
				//Array creation of 2nd dimension
				//traversing to take user input to store number of elements in arr
				for(int i=0; i<arr.length; i++) {
					System.out.println("Enter how many elements to be stored in arr "+(i+1));
									
					//Storing 2D value
					arr[i] = new int[scan.nextInt()];
				}
				
				//traversing to take user input to store number of elements in brr
				for(int i=0; i<brr.length; i++) {
					System.out.println("Enter how many elements to be stored in brr "+(i+1));
					
					//Storing 2D value
					brr[i] = new int[scan.nextInt()];
				}
				
				//traversing to take user input to store number of elements in crr
				for(int i=0; i<crr.length; i++) {
					System.out.println("Enter how many elements to be stored in crr "+(i+1));
										
					//Storing 2D value
					crr[i] = new int[scan.nextInt()];
				}
				
				
				//Array Initialization for arr
				for(int i=0; i<arr.length; i++) {
					System.out.println("Enter element to store in arr "+(i+1));
					
					for(int j=0; j< arr[i].length; j++) {
						System.out.println("Enter element "+(j+1));
						arr[i][j]= scan.nextInt();
					}
				}
				
				//Array Initialization for brr
				for(int i=0; i<brr.length; i++) {
					System.out.println("Enter element to store in brr "+(i+1));
					
					for(int j=0; j< brr[i].length; j++) {
						System.out.println("Enter element "+(j+1));
						brr[i][j]= scan.nextInt();
					}
				}
				
				//Array Initialization for crr
				for(int i=0; i<crr.length; i++) {
					System.out.println("The Sum of arr "+(i+1)+" and brr "+(i+1));
					
					for(int j=0; j< crr[i].length; j++) {
						
						crr[i][j]= arr[i][j]+ brr[i][j];
						
						System.out.print(crr[i][j]+" ");
					}
					System.out.println();
					
					
				}
		scan.close();
	}

}
