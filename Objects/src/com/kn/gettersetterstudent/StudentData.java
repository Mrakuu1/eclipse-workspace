package com.kn.gettersetterstudent;

public class StudentData {
	private int rollnumber;
	private String name;
	private int marks;
	private String gender;

	public StudentData(int rollnumber, String name, int marks, String gender) {
		this.rollnumber = rollnumber;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
