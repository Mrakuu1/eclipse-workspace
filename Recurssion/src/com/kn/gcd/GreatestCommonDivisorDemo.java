package com.kn.gcd;

import java.util.Scanner;

public class GreatestCommonDivisorDemo {

	public static void main(String[] args) {
		// taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("=========GCD of 2 Numbers=========");
		System.out.println("Enter the number 1: ");
		int input1 = scan.nextInt();
		
		System.out.println("Enter the number 2: ");
		int input2 = scan.nextInt();

		// creating an factorial object to find factorial
		GreatestCommonDivisor gcd = new GreatestCommonDivisor();

		// calling a method to find factorial
		int res = gcd.findGCD(input1, input2);

		System.out.println("GCD of " + input1 +" & "+ input2 + " = " + res);
		// release the resource
		scan.close();
	}

}
