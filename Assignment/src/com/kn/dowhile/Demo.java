package com.kn.dowhile;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Numbers to find its Sum in Single Digit: ");

		int num = s.nextInt();
		
		
		int sum = findSumOfDigit(num);
		
//			 while(sum>=10) 
//			 {
//			 sum = findSumOfDigit(sum);
//		     }
		System.out.println("The sum = "+sum);
		s.close();
	}

	 static int findSumOfDigit(int num) {
//		int sum =0;
//		while(num > 0){
//			int r = num%10;
//			sum = sum + r;
//			num=num/10;
//		}
//		return sum;
		 
		 while(num>=10) 
		 {
			 int sum = 0;
			 while(num !=0)
			 {
				 int r = num%10;
					sum = sum + r;
					num=num/10;
			 }
			 num = sum;
		 }
		 return num;
		 
	}
		 
}