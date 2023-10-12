package com.kn.WhileLoop;

import java.util.Scanner;

public class AvgOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a range to find Average of numbers: ");

		int range = s.nextInt();
		
		 findAvg(range);
		
		s.close();
	}

	private static void findAvg(int range) {
		
		double sum = 0;
		int i = 0;
		while (i <= range)
		{
			
			sum = sum + i;
			i++;
			
		}
			System.out.println("The sum of given range = "+sum);
		System.out.println("The avg of given range is = "+(sum/2));
	}
	
}



