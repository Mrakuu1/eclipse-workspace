package com.kn.WhileLoop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find the SquareRoot : ");

		int num = s.nextInt();

		double res = findSquareRoot(num);
		
		System.out.println("The sqrt of " + num +" is "+res);
		
		s.close();
	}

	 static double findSquareRoot(int num) {
		double sqrt = Math.sqrt(num);
		 return sqrt;

	}

}
