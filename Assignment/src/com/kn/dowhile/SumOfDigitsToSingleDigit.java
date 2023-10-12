package com.kn.dowhile;

import java.util.Scanner;

public class SumOfDigitsToSingleDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the numbers to find Sum in single digit: ");

		int num = s.nextInt();
		
		 findSumOfDigit(num);
		
		
		s.close();
	}

	  

	static void findSumOfDigit(int num) {
		 int finalsum =0;
		 int i =1;
		 int digit,sum = 0;
		 do
		 {
			 digit =num%10;
			 sum = sum + digit;
			 num= num/10;
			 do
		        {
		            if (num == 0) {
		                num = sum;
		                sum = 0;
		            }
		            sum += num % 10;
		            num /= 10;
		        }while (num > 0 || sum > 9);
			 
		 }while(i>num);
		 
		 System.out.println("sum is = "+sum);
		 
//		 do {
//			
//			 
//				 
//				 digit = sum%10;
//				 sum=sum/10;
//				 finalsum= finalsum + digit;
//				 
//			 
//		 }while(sum>9);
		 
		 
		 
		 do
	        {
	            if (num == 0) {
	                num = sum;
	                sum = 0;
	            }
	            sum += num % 10;
	            num /= 10;
	        }while (num > 0 || sum > 9);
		 
		 System.out.println(finalsum);
	}

}
