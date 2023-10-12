package com.kn.WhileLoop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find perfect number : ");

		int num = s.nextInt();

		isPerfect(num);

		s.close();
	}

	static void isPerfect(int num) {
		int sum = 0;
		int i = 1;
		while (i < num) {
			if (num % i == 0) {
				System.out.print(i + " ");
				sum = sum + i;
			}
			i++;
		}
		if (sum == num) {
			System.out.println("\n");
			System.out.println(num + " is perfect number");
		} else {
			System.out.println("\n");
			System.out.println(num + " is not perfect number");
		}
	}

}
