package com.kn.dowhile;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Decimal to find its Binary: ");
		
		int num = s.nextInt();
		
		findBinary(num);
		s.close();
	}

	 static void findBinary(int num) {
		 int binary=0;
		 int pValue=1;
		 
		 do {
			 
			
			 int remainder = num%2;
			 binary += pValue * remainder;
			 pValue *= 10;
			 num /= 2;
			
		}while(num>0);
		
		System.out.println(binary);
	 }
}
