package com.kn.dogclass;

import java.util.Scanner;

public class DogApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your dog name = ");
		String name = scan.next();
		System.out.println("Enter your dog color = ");
		String color = scan.next();
		System.out.println("Enter your dog age = ");
		int age = scan.nextInt();
		System.out.println("Enter your dog breed = ");
		String breed = scan.next();

		Dog data = new Dog(name, color, age, breed);

		System.out.println("Name = " + data.getName());
		System.out.println("Color = " + data.getColor());
		System.out.println("Age = " + data.getAge());
		System.out.println("Breed = " + data.getBreed());

		scan.close();

	}

}
