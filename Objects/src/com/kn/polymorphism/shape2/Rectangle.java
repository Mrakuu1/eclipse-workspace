package com.kn.polymorphism.shape2;

public class Rectangle extends Shape{
	double length = 10.0, breadth = 5.5;

	public double calculateArea() {
		return length*breadth;
	}
	
	public double calculatePerimeter() {
		return length * breadth * 2;
	}
}
