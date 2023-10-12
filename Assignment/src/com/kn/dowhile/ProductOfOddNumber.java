package com.kn.dowhile;

import java.util.Scanner;

public class ProductOfOddNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a range to find product of Odd numbers: ");

		int range = s.nextInt();

		findproduct(range);

		s.close();
	}

	private static void findproduct(int range) {

		int product = 1;
		int i = 1;
		while (i <= range) {
			if (i % 2 == 1) {
				product = product * i;
			}
			i++;

		}

		System.out.println("The product of given range is = " + product);
	}

}
