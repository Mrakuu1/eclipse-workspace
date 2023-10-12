/*
You are developing a software for a vending machine. 
The program should take a product code as input and output the product name. 
The product codes are 1 for "Coke", 2 for "Pepsi", 3 for "Water", 4 for "Juice", 5 for "Tea".

Sample Input 1: 3
Sample Output 1: Water
Sample Input 2: 5
Sample Output 2: Tea
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1. Water \n2.Coke \n3.Pepsi \n4.Juice \n5.Tea");
		System.out.println("Enter the Prodcut key : ");
		int key = s.nextInt();
		
		vendProduct(key);
		
		s.close();
	}

	 static void vendProduct(int key) {
		 switch(key) {
		 case 1:
			 System.out.println("Water");
			 break;
		 case 2:
			 System.out.println("Coke");
			 break;
		 case 3:
			 System.out.println("Pepsi");
			 break;
		 case 4:
			 System.out.println("Juice");
			 break;
		 case 5:
			 System.out.println("Tea");
			 break;
			 
			 default:
				 System.out.println("Enter Vaild Key");
				 break;
		 }
	}

}
