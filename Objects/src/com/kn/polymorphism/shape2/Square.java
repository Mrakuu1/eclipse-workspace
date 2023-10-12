package com.kn.polymorphism.shape2;

public class Square extends Shape{
	double side = 4;
		
	public double calculateArea() {
		return side*side;
	}
	
	public double calculatePerimeter() {
		return 4*side;
	}
}
