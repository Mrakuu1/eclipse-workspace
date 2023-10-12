package com.kn.polymorphism.shapes;

public class Circle extends Shapes {
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public double calculateArea() {
		double r = 2.5;
		return Math.PI*r*r;
	}
}
