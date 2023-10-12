package com.kn.WhileLoop;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range to find number of digits entered : ");

		int num = s.nextInt();

		numberOfDigits(num);
		
		s.close();
	}

	static void numberOfDigits(int num) {
		int count =0, digit =0;
		
		while (num > 0) {
				digit = num % 10;
				if(digit>=0) {
					count++;
				}
				num = num/10;
			}
		System.out.println("The Number of digits present in given number is = "+count);
	}

}
