package com.kn.TwoDimensionalarrays;

import java.util.Scanner;

public class CarAndModelsUsingJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(">>>> Enter the Number of Car brands <<<<");
		// take number of car brands as input to store in array
		String[] carManufacturer = new String[scan.nextInt()];
	
		//taking brand name as input from user
		for (int i = 0; i < carManufacturer.length; i++) {
			System.out.println("----> Enter the Manufacture name "+(i+1)+" <----");
			
			carManufacturer[i] = scan.next();
		}
		
//		System.out.println(">>>>>>>The Top Car brands are<<<<<<<");
//		for(int i=0; i<carManufacturer.length;i++) {
//			System.out.println((i+1)+". " + carManufacturer[i]);
//		}
		
		
		//Array declaration and creation of car models
		
		
		
		String[] carModels;

		// display the brand name
		for(int i=0; i<carManufacturer.length; i++) {
			System.out.println("Enter number of models for brand manufacturer "+carManufacturer[i]);
			
			carModels = new String[scan.nextInt()];			
			
			for (int j = 0; j < carModels.length; j++) {
			// display the models name
			System.out.println("Enter model "+(j+1));
				
				carModels[j]=scan.next();				
			}			
		}
		
		for(int i=0; i<carManufacturer.length;i++) {
			System.out.println("The top models of brand manufacturer "+carManufacturer[i]+" are");
			
//			for(int j=0; j<carModels.length; j++) {
//				System.out.println((j+1)+". "+ carModels[j]);
//			}
		}
			
		
		scan.close();
		}
		
}


