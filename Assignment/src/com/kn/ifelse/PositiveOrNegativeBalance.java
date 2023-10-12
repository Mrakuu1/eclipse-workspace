/*  You're developing a software tool for a financial institution. 
	The software should be able to validate if the input balance amount is positive or negative. 
	Write a Java program that takes a balance amount as input. If the amount is less than 0, 
	the program should print "Negative Balance". Otherwise, it should print "Positive Balance". 
	
	Sample Input 1: 500
	Sample Output 1: Positive Balance
	Sample Input 2: -200
	Sample Output 2: Negative Balance
*/

package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegativeBalance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your balance: ");
		
		int balance = s.nextInt();
		
		boolean result = checkBalance(balance);
		
		if(result == false) {
			System.out.println("Negative Balance.");
		}else {
			System.out.println("Positive Balance.");
		}
		s.close();
	}

	 static boolean checkBalance(int b) {
		 if(b>0) {
			 return true;
		 }else {
			 return false;
		 }
	}

}


/*
 Enter your balance: 
500
Positive Balance.

Enter your balance: 
-200
Negative Balance.


 */
