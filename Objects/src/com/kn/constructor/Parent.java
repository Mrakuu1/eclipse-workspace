package com.kn.constructor;

public class Parent {

	String name;
	int age;
	
	public Parent() {
		System.out.println("Parent no-arg constructor");
	}
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
		System.out.println("Parent 2-arg constructor");
	}
	
	
	
}
