/*
 You're designing a software that teaches young kids about different types of characters. 
The program should take a character as input. 
If it's a lowercase vowel, it should print "Lowercase Vowel". 
If it's an uppercase vowel, it should print "Uppercase Vowel". 
If it's a lowercase consonant, it should print "Lowercase Consonant". 
If it's an uppercase consonant, it should print "Uppercase Consonant". 
If it's a digit, it should print "Digit". 
For all other characters, it should print "Special Character".

Sample Input 1: 'a'
Sample Output 1: Lowercase Vowel
Sample Input 2: '$'
Sample Output 2: Special Character
 */

package com.kn.elseifladder;

import java.util.Scanner;

public class TypesOfCharacters {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		
		char check = s.next().charAt(0);
		
		 findChar(check);
		
		s.close();
		
	}

	 static void findChar(char ch) { 
		 
		if(ch >=97 && ch<=122) {
		
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
			System.out.println("LowerCase Vowel");
			}	
			else 
			{
				System.out.println("LowerCase Consonant");
			}
		}
		else if(ch>=65 && ch<=90){
			
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
			System.out.println("UpperCase Vowel");
			}
			else
			{
			System.out.println("UpperCase Consonant");
			}
			}
		
		else if(ch >=48 && ch<=57) 
		{
			System.out.println("digit");
		}
		else 
		{
			System.out.println("Special Characters");
		} 
	 
	 }

}
