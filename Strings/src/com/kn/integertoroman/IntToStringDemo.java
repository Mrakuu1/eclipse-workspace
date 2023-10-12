package com.kn.integertoroman;

import java.util.Scanner;

public class IntToStringDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//taking number input from user
		System.out.println("Enter the number : ");
		int inputNum = scan.nextInt();
		
				
		//object to convert int to roman
		IntToString itr = new IntToString();
		
		//calling method to change int number to roman number
		itr.intToRoman(inputNum);
			
		//release the resource
		scan.close();
	}

}
