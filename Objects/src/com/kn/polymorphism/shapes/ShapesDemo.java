package com.kn.polymorphism.shapes;

public class ShapesDemo {

	public static void main(String[] args) {
//		Shapes sh = new Shapes();
//		Rectangle r = new Rectangle();
//		sh=r;
//		
//		sh.draw();
//		System.out.println(sh.calculateArea());
//		
//		Square s = new Square();
//		sh=s;
//		
//		sh.draw();
//		System.out.println(sh.calculateArea());
//		
//		Circle c = new Circle();
//		sh=c;
//		
//		sh.draw();
//		System.out.println(sh.calculateArea());
		
		Rectangle r = new Rectangle();
		Square s = new Square();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		
		g.doActivity(r);
		g.doActivity(s);
		g.doActivity(c);
		
	}

}


//https://forms.gle/jqdB1pHAqkh1QCUH9
