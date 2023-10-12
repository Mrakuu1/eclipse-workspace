package com.kn.ceasercipher;

import java.util.Scanner;

public class CipherTextDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//taking String input from user
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();
		
		System.out.println("Enter the number to encrypt the string");
		int n = scan.nextInt();
				
		
		//creating a object to convert the given string to cipher text
		CipherText ct = new CipherText();
		
		//calling method to convert the given string to cipher text
		String encrypt = ct.cipherText(inputString,n);
		
		System.out.println("The encrypted String = \n=====================\n"+encrypt);
		
		//release the resource
		scan.close();
	}

}
