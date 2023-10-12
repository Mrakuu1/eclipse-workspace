package com.kn.constructor;

public class Child {
	String name;
	int age;
	
	public Child() {
		this("Akash");
		
	}
	
	public Child(String string) {
		// TODO Auto-generated constructor stub
	}
	
	public Child(String name, int age) {
		this(111);
		this.name = name;
		this.age = age;
	}

	public Child(int i) {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
