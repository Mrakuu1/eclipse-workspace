package com.kn.WhileLoop;

import java.util.Scanner;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a range to find product of Even numbers: ");

		int range = s.nextInt();

		 findproduct(range);
		
		s.close();
	}

	private static void findproduct(int range) {
		
		int product = 1;
		int i = 1;
		while (i <= range) {
			if(i%2 == 0) {
				product = product*i;
			}
			i++;

		}
		
		System.out.println("The product of given range is = "+product);
	}

}
