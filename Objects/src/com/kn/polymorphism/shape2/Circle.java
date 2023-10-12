package com.kn.polymorphism.shape2;

public class Circle extends Shape {
	double radius = 5.5;
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}
