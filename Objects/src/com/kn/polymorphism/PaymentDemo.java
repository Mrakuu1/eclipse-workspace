package com.kn.polymorphism;

import java.util.Scanner;

public class PaymentDemo {

	public static void main(String[] args) {
		
		//scanner class to take input from user
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose the below option to make payment : ");
		System.out.println("1.UPI\n2.Wallet\n3.Card\n4.Cash");
		System.out.println();	
		
		//payment declaration
		Payment p;
			
		//taking option as input from user to make payment  
		int n = scan.nextInt();
		
		//validating option entered by user 
		if(n==1) {
			p = new UPI();
			p.bill();
			p.offer();
			p.pay();
		}else if(n==2) {
			p = new Wallet();
			p.bill();
			p.offer();
			p.pay();
		}else if(n==3) {
			p = new Card();
			p.bill();
			p.offer();
			p.pay();
		}else if(n==4){
			p = new Payment();
			p.bill();
			p.offer();
			p.pay();
		}else {
			System.out.println("Enter valid option...../");
		}
			
			
			//releasing the resource
			scan.close();
			
			
	}

}
