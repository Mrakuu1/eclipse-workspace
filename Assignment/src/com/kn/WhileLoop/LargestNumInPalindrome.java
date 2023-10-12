//Write a program to calculate the sum of a series 1 + 1/2 + 1/3 + ... + 1/n.
package com.kn.WhileLoop;

import java.util.Scanner;

public class LargestNumInPalindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a range to check largest Palindrome: ");

		int num = s.nextInt();

		
		isLargePalindrome(num);
		s.close();
	}
	
	

	 static void isLargePalindrome(int num) {
		 int i = num;
		 while(i>=1) {
			 if(isPalindromeOrNot(i)) {
				 System.out.println("The Largest palindrome number is "+i+" given within the range of "+num);
				 break;
			 }
			 i--;
		 }
	}



	static boolean isPalindromeOrNot(int num) {
		int digit = 0;
		int rev = 0;
		int temp = num;
		while (num != 0) {

			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if(temp == rev) {
			return true;
		}
		return false;
	}
}
