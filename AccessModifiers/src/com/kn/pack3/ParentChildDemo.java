package com.kn.pack3;

public class ParentChildDemo {
	public static void main(String[] args) {
			Parent p1 = new Parent();
			p1.skinColor();
			p1.eyeColor();
			p1.height();
			p1.weight();
			
			System.out.println("--------Child-----------");
			Child c1 = new Child();
			c1.eyeColor();
			c1.height();
			c1.insta();
			c1.pubg();
			c1.weight();
			c1.skinColor();
	}
}
