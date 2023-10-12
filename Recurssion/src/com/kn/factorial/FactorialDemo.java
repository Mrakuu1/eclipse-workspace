package com.kn.factorial;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		//taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial: ");
		int number = scan.nextInt();
		
		//creating an factorial object to find factorial		
		Factorial fact = new Factorial();
		
		
		//calling a method to find factorial
		int res = fact.findFactorial(number);
		
		System.out.println("Factorial of "+number+" = "+ res);
		//release the resource
		scan.close();

	}

}
