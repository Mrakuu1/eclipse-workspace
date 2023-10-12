package com.kn.polymorphism.shapes;

public class Rectangle extends Shapes {
	public void draw() {
		System.out.println("Drawing rectangle");
	}
	
	public double calculateArea() {
		double l=10.5, b=5.5;
		return l*b;
	}
}
