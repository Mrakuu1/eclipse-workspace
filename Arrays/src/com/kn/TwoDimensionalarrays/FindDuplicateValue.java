package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class FindDuplicateValue {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		//taking array size as input from user
		System.out.println("Enter the array size: ");
		int[] arr = new int[scan.nextInt()];
		
		int k=0;
		
		//taking data to store in array
		System.out.println("Enter the numbers: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		
		//traversing to find whether duplicate value is present or not
		System.out.println("duplicate value...!");
		for(int i=0; i<arr.length; i++) {
			for(int j=(i+1); j<arr.length; j++) {
				 if(arr[i]==arr[j])
					k=j;
				 break;
				
			}
		}
		//printing duplicate value
		System.out.println(arr[k]);
		
		scan.close();
	}

}
