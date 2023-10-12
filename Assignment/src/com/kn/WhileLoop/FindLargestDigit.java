package com.kn.WhileLoop;

import java.util.Scanner;

public class FindLargestDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find large digit : ");

		int num = s.nextInt();

	 findLargestDigit(num);
		
		
		
		s.close();
	}

	private static void findLargestDigit(int num) {
		int digit = 0;
		int temp = -1;
		while (num != 0) {

			digit = num % 10;
			
			
			if(digit > temp ) {
				temp = digit;
			}
			num = num / 10;
		}
		System.out.println(temp + " is the large digit");
	}

}
