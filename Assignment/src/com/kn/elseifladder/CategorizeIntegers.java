/*
As part of a school assignment, you are creating a program to categorize integers. 
The program should take an integer as input. If the integer is less than 0, it should print "Negative". 
If the integer is greater than 0, it should print "Positive". If the integer is exactly 0, it should print "Zero".

Sample Input 1: -45
Sample Output 1: Negative
Sample Input 2: 89
Sample Output 2: Positive
 */

package com.kn.elseifladder;

import java.util.Scanner;

public class CategorizeIntegers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");
		
		int number = s.nextInt();
		
		String categorizedNum = isPositiveOrNegative(number);
		
		System.out.println(categorizedNum);
		
		s.close();
	}

	 static String isPositiveOrNegative(int num) {
		 
		 String p = "Positive";
		 String n = "Negative";
		 String z = "Zero";
		 
		 if(num > 0) {
				return p;
			}else if(num < 0){
				return n;
			}else {
				return z;
			}
	 }

}


/*
Enter an Integer: 
-45
Negative

Enter an Integer: 
89
Positive

Enter an Integer: 
0
Zero


 */
