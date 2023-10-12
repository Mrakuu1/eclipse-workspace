package com.kn.polymorphism.shape2;

public class Geometry {

	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calculateArea());
		
		if(sh instanceof Rectangle) {
			System.out.println("Perimeter of Rectangle = "+(((Rectangle)(sh)).calculatePerimeter()));
		}else if(sh instanceof Square) {
			System.out.println("Perimeter of Square = "+(((Square)(sh)).calculatePerimeter()));
		}else {
			System.out.println("Perimeter of Circle = "+(((Circle)(sh)).calculatePerimeter()));
		}
		
		System.out.println("-----------------------------------------------------------");
	}
}
