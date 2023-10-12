package com.kn.constructorcall;

public class Student {

	String name;
	int age;
	
	public Student() {
		this("Aj",2);
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(int age) {
		super();
		this.age = age;
	}
	
	
	
	
}
