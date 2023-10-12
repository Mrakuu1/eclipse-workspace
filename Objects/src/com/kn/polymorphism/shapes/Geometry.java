package com.kn.polymorphism.shapes;

public class Geometry {
	public void doActivity(Shapes sh) {
		sh.draw();
		System.out.println(sh.calculateArea());
	}
}
