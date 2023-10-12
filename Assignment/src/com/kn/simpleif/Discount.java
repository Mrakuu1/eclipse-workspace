/*
 You're helping design the software for a retail store's automatic checkout system. 
There's a discount policy in place for purchases exceeding $200. 
Your Java program should take as input the total purchase amount. 
If the total amount is more than $200, the program should print "Discount of 20% applicable".

Sample Input 1: 250
Sample Output 1: Discount of 20% applicable
Sample Input 2: 180
Sample Output 2:
 */

package com.kn.simpleif;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the TOTAL BILL AMOUNT in $: ");
		
		double TotalBill = s.nextDouble();
		
		boolean Res = CalculateDiscount(TotalBill);
		if(Res == true) {
		System.out.println("Discount 20% Applicable");
		}
		s.close();
	}

	static boolean CalculateDiscount(double totalBill) {
		
		if(totalBill > 200) {
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
 
 Enter the TOTAL BILL AMOUNT in $: 
300
Discount 20% Applicable




 Enter the TOTAL BILL AMOUNT in $: 
40



 */









