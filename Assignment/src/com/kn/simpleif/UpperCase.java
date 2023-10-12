/*
 	You're creating a typing software that helps users improve their typing skills. 
 	One part of the software focuses on capital letters. 
 	Your program should accept a character as input. 
 	If the character is a capital letter, the program should print "Capital letter detected".
Sample Input 1: 'K'
Sample Output 1: Capital letter detected
Sample Input 2: 'h'
Sample Output 2: 
 */

package com.kn.simpleif;

import java.util.Scanner;

public class UpperCase 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character to find UpperCase or not: ");
		
		char character= s.next().charAt(0);
		
		boolean res = isUpperCase(character);
		if(res == true) 
		{
			System.out.println("Capital letter detected");
		}
		s.close();
	}

	 static boolean isUpperCase(char c)
	 { 
		 if(Character.isUpperCase(c)) 
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 } 
}
	







/*
 output:
 
 Enter a character to find UpperCase or not: 
 A
 Capital letter detected
 
 
 
 
Enter a character to find UpperCase or not: 
a

 
 */


