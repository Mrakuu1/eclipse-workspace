package com.kn.WhileLoop;

import java.util.Scanner;

public class SumOfSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a range : ");

		int num = s.nextInt();

	 findSquareOfNumbers(num);
		
		
		
		s.close();
	}

	private static void findSquareOfNumbers(int num) {
		
		int sum = 0,sq = 0;
		int i = 1;
		while (i<=num) {
			sq = i*i ;
			System.out.print(i+"= ");
			System.out.println(sq+ " ");
			
			sum = sum + sq;
			
			i++;
		}
		System.out.println();
		
		System.out.println("The sum of square numbers = " +sum);
	}

}
