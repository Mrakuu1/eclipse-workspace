// Write a program to print the first n prime numbers.
package com.kn.ForLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to check Prime or not : ");
		
		int num = s.nextInt();
		
		String res = printPrimeNumber(num);
		
		System.out.println(res);
	
//		boolean prime = printPrimeNumber(num);
//		if(prime == true) {
//			System.out.println(num+" is a prime number");
//		}else {
//			System.out.println(num+" is not a prime number");
//		}
		s.close();
	}

//	static boolean printPrimeNumber(int num) {
//		 boolean prime= true;
//		for(int i=2; i<=num; i++) {
//			if(num%2==0) {
//				prime = false;
//				break;
//			}
//		}
//		return prime;
//	}
	
	
	
		 static String printPrimeNumber(int num) {
		 int count = 0;
		 for(int i=1; i<=num; i++) {
			 if(num%i == 0) {
				 
				count++;
			 }
		 }
		 if(count == 2) {
//			 System.out.println();
//			 System.out.println(num+" is a Prime");
			 return "PRIME";
		 }else {
//			 System.out.println(num+" is a not Prime");
			 return "NOT PRIME";
		 }
	}

}
