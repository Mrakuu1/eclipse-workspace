//Write a program to calculate the factorial of a given number.

package com.kn.ForLoop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a range to find Fibonacci Series : ");
		
		int range = s.nextInt();
		
		printFibonacciSeries(range);
		s.close();
	}

	static void printFibonacciSeries(int range) {
		int fn= 0, sn=1;
		System.out.println("First number = "+fn+" Second Number ="+sn);
		int nextNumber =0;
		for(int i=0; i<=range; i++) {
			nextNumber = fn + sn;
			fn = sn;
			sn = nextNumber;
			
			System.out.print(nextNumber+ " ");
		}
	}

}
