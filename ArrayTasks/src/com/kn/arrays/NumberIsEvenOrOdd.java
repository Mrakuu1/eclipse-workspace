package com.kn.arrays;

public class NumberIsEvenOrOdd {

	// Method to check numbers are even or odd
	public void isNumberEvenOrOdd(int[] arr) {
		// initializing count of even and odd with 0
		int even = 0, odd = 0;

		
		System.out.println("======================");

		for (int i = 0; i < arr.length; i++) {
			
			// validating numbers are even or odd
			if (arr[i] % 2 == 0)
			{
				//if remainder is 0 increase even count
				even++;
			} 
			else
			{
				//if remainder is not 0 increase odd count
				odd++;
			}

		}
		// printing total even number counts
		System.out.println("Total Even numbers = " + even);

		// printing total odd number counts
		System.out.println("Total Odd numbers = " + odd);
	}
}