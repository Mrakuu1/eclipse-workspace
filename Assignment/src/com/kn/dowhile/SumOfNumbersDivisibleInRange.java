package com.kn.dowhile;

import java.util.Scanner;

public class SumOfNumbersDivisibleInRange {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a range to find SUM of numbers: ");

		int range = s.nextInt();
		
		System.out.println("Enter Divisor : ");
		
		int num = s.nextInt();

		 findSum(range,num);
		
		s.close();
	}

	private static void findSum(int range,int num) {
		
		int sum = 0;
		int i = 1;
		do {
			if(i%num == 0) {
				//System.out.println(i);
				sum = sum + i;
			}
			i++;
		}while (i <= range);
		
		System.out.println("The sum of given range is = "+sum);
	}

}
