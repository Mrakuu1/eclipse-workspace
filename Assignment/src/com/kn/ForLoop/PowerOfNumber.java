//Write a program to calculate the power of a number.

package com.kn.ForLoop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base and Exponent to find Power: ");
		
		System.out.print("Base = ");
		int base=s.nextInt();
		
		System.out.print("Exponent = ");
		int exp=s.nextInt();
		
		int power = findPower(base,exp);
		
		System.out.println("The power for given Number = "+power);
		
		s.close(); 
	}

	 static int findPower(int base, int exp) {
		 int power =1;
		 for (int i=1; i<=exp; i++) {
			 power = power * base;
		 }
		 return power;
	}

}
