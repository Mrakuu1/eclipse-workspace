package com.kn.polymorphism.shapes;

public class Square extends Shapes{
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	public double calculateArea() {
		double side=5.5;
		return side*side;
	}
}
