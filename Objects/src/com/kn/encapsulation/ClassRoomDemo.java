package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ClassRoom cr = new ClassRoom();
		System.out.println("Temperature = "+cr.getTemperature());
		
		System.out.println("Enter Temperature = ");
		cr.setTemperature(scan.nextInt());
		
		System.out.println("Temperature = "+cr.getTemperature());
		
		scan.close();
	}

}
