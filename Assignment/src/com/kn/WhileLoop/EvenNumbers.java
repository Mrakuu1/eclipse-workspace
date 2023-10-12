package com.kn.WhileLoop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range to Even number : ");

		int range = s.nextInt();

		printEvenNumbers(range);
		s.close();
	} 

	static void printEvenNumbers(int range) {

		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {

				System.out.print(i + " ");
			}
		}

	}
}
