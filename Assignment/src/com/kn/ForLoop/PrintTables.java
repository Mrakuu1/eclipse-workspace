//4. Write a program to print a given number table.
package com.kn.ForLoop;

import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to print the table: ");
		
		int num = s.nextInt();
		
		 printTableOfTheNumber(num);
		s.close();
	}

	 static void printTableOfTheNumber(int num) {
		 int table = 0;
		 for(int i=1; i<=10; i++) {
			  
			 table = num*i;
			 
			 System.out.println(num+ " * "+ i+" = "+ table);
		 }
	}

}
