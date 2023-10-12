package com.kn.practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int range = scan.nextInt();

		avgOfNum(range);

		scan.close();

	}

	public static void avgOfNum(int range) {

		int sum = 1;
		int total = 0;
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				
				sum = sum * i;
				System.out.println(i);
				

			}
		}

		System.out.println("total = " + sum);

	}

}
