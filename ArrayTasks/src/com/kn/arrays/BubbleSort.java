package com.kn.arrays;

public class BubbleSort {
	
	//method to sort the Array elements using bubble sort
	public int[] swapArrayNumber(int[] arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				int temp = 0;
				
				//swapping the array elements
				if (arr[j] > arr[j + 1]) {
					
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
				}
			}

		}
		
		//return the sorted Array elements
		return arr;
	}
}
