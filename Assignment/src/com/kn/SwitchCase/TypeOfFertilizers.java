/*
You're creating an application for a gardening shop that provides advice on the type of fertilizer 
to use based on the type of plant. The application should take a plant type as input 
(1 for Roses, 2 for Sun flowers, 3 for Orchids, 4 for Cacti, 5 for Ferns) and 
suggest the type of fertilizer to use. Consider the following fertilizers: Roses - Rose Food, 
Sun flowers - All Purpose Fertilizer, Orchids - Orchid Fertilizer, Cacti - Cactus Mix, Ferns - Organic Compost.

Sample Input 1: 1
Sample Output 1: Rose Food
Sample Input 2: 4
Sample Output 2: Cactus Mix
 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class TypeOfFertilizers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1 for Roses\n2 for Sun flowers\n3 for Orchids\n4 for Cacti\n5 for Ferns");

		int num = s.nextInt();

		typeOfPlant(num);
		
		s.close();

	}

	static void typeOfPlant(int num) {
		switch (num) {
		case 1:
			System.out.println("Roses - Rose Food");
			break;
		case 2:
			System.out.println("Sun flowers - All Purpose Fertilizer");
			break;
		case 3:
			System.out.println("Orchids - Orchid Fertilizer");
			break;
		case 4:
			System.out.println("Cacti - Cactus Mix");
			break;
		case 5:
			System.out.println("Ferns - Organic Compost");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

}
