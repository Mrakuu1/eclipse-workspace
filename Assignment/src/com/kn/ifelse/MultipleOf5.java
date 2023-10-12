/*
Imagine you're creating a simple number categorization program. 
The program should take a number as input. 
If the number is a multiple of 5, the program should print "Multiple of 5". 
In all other cases, it should print "Not a multiple of 5".

Sample Input 1: 20
Sample Output 1: Multiple of 5
Sample Input 2: 23
Sample Output 2: Not a multiple of 5

 */


package com.kn.ifelse;

import java.util.Scanner;

public class MultipleOf5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		
		int number = s.nextInt();
		
		boolean remainder = isMultiple(number);
		if(remainder == true) {
			System.out.println(number + " is multiple of 5");
		}else {
			System.out.println(number + " is not multiple of 5");
		}
		s.close();
	}

	static boolean isMultiple(int num) {
		if(num%5 == 0) {
			return true;
		}else {
			return false;
		}
	}

}

/*


Enter a Number: 
25
25 is multiple of 5

Enter a Number: 
23
23 is not multiple of 5



 */
