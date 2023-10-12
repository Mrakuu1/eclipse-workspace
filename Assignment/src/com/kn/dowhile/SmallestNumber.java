package com.kn.dowhile;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Decimal to find smallest number: ");

		int num = s.nextInt();
		
		 findSmallestDigit(num);
		
		
		s.close();
	}

	static void findSmallestDigit(int num) {
		int digit = 0;
		int temp = 9;
		while (num != 0) {

			digit = num % 10;
			
			
			if( digit <= temp) {
				temp = digit;
			}
			num = num / 10;
		}
		System.out.println(temp + " is the smallest digit");
	}

}
