package com.kn.WhileLoop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find Armstrong or not: ");

		int num = s.nextInt();

		int result = findArmstrong(num);
		if(result == num) {
			System.out.println(result + " is Armstrong number");
		}else {
			System.out.println(result + " is not Armstrong number");
		}
		
		
		s.close();
	}

	private static int findArmstrong(int num) {
		int as = 0,digit = 0;
		int cube = 1;
		
		while (num != 0) {

			digit = num % 10;
			cube = digit * digit * digit;
			as = as + cube;
			num = num / 10;

		}
		return as;
	}

}
