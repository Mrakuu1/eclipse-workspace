package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class SumOFNumberUsingArrayIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//enter arr length
		System.out.println("Enter length of row 1");
		int[] arr = new int[scan.nextInt()];
		
		//enter brr length
		System.out.println("Enter length of row 2");
		int[] brr = new int[scan.nextInt()];
		
		
		System.out.println("Enter length of result row: ");
		int [] crr=new int [scan.nextInt()];
		
		//enter values to insert in row 1
		System.out.println("Enter the values in row 1: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		//enter values to insert in row 2
		System.out.println("Enter the values in row 2: ");
		for(int i=0; i<brr.length; i++) {
			brr[i]=scan.nextInt();
		}
		
		//calculating sum 
	
		System.out.println("sum of row1 and row2 index are: ");
		for(int i=0;i<arr.length && i<brr.length; i++) {
			
		crr[i] = arr[i]+ brr[i];
								
				System.out.println(crr[i]);
			}
		scan.close();
		}
		
	
	}


