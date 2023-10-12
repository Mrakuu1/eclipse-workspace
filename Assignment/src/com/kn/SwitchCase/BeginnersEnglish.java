/*
You're developing a program to help beginners learn English. 
The program should take a number between 0 to 9 as input and 
print the corresponding English word for the number.
Sample Input 1: 3
Sample Output 1: Three
Sample Input 2: 7
Sample Output 2: Seven

 */


package com.kn.SwitchCase;

import java.util.Scanner;

public class BeginnersEnglish {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Digit from 0-9: ");
		
		byte digit = s.nextByte();
		
		digitToWord(digit);
		
		s.close();
	}

	 static void digitToWord(byte digit) {
		 switch(digit) {
		 case 0:
			 System.out.println("Zero");
			 break;
		 case 1:
			 System.out.println("One");
			 break;
		 case 2:
			 System.out.println("Two");
			 break;
		 case 3:
			 System.out.println("Three");	
			 break;
		 case 4:
			 System.out.println("Four");
			 break;
		 case 5:
			 System.out.println("Five");
			 break;
		 case 6:
			 System.out.println("Six");	 
			 break;
		 case 7:
			 System.out.println("Seven");
			 break;
		 case 8:
			 System.out.println("Eight");
			 break;
		 case 9:
			 System.out.println("Nine");
			 break;
		 }
	}

}




/*
output:

Enter a Digit from 0-9: 
2
Two


Enter a Digit from 0-9: 
10

 */





