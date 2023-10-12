package com.kn.inheritancetask;

public class RoboDemo {

	public static void main(String[] args) {
			
//		ChefRobo chef = new ChefRobo();
//		chef.name = "Ra-One";
//		chef.type = "V1.0";
//		
//		chef.walk();
//		chef.talk();
//		chef.charge();
//		chef.cook();
		
		DriverRobo dr = new DriverRobo();
		
		dr.name = "Uppi";
		dr.type = "2.0";
		
		dr.walk();
		dr.talk();
		dr.charge();
		dr.Drive();
	}

}
