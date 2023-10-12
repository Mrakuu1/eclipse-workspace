//Write a program to find the GCD of two numbers.
package com.kn.ForLoop;

import java.util.Scanner;

public class GCDofTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers to find GCD: ");
		
		System.out.print("number1 = ");
		int fn=s.nextInt();
		System.out.print("number2 = ");
		int sn=s.nextInt();
		
		int gcd = findGCD(fn,sn);
		
		 System.out.println("The GCD of given number = "+gcd);
		 
		 s.close();
	}

	 static int findGCD(int fn, int sn) {
		 int cf =1;
		 for(int i=1; i<=fn && i<=sn; i++) {
			 if(fn%i==0 && sn%i==0) {
				 cf =i ;
			 }
			 
		 }
//		 System.out.println("The GCD of given number = "+cf);
		 return cf;
	}
	
}
