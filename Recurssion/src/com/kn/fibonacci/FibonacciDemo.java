package com.kn.fibonacci;

import java.util.Scanner;

public class FibonacciDemo {

	public static void main(String[] args) {
		//taking input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scan.nextInt();
		
		//creating an factorial object to find factorial		
		Fibonacci fib = new Fibonacci();
		
		
		//calling a method to find factorial
		int res = fib.fibonacci(number);
		
		System.out.println("Fibonacci = "+ res);
		//release the resource
		scan.close();
	}

}
