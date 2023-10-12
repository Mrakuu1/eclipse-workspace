package com.kn.arrays;

public class SumOfElements {
	
	//Method to print the sum of array elements
	public int printSumofElements(int[] arr) {
		
		
		//Initializing sum 
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			
			//calculating sum of array elements
			sum = sum + arr[i];
			
		}
		//return total sum of array elements
		return sum;
	}
}
