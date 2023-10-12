/*
You're developing an interactive tool for a driving school. 
The tool takes a traffic light color (Red, Yellow, Green) as input and suggests the action a driver should take. 
The program should print "Stop" for "Red", "Ready" for "Yellow", and "Go" for "Green".

Sample Input 1: Red
Sample Output 1: Stop
Sample Input 2: Green
Sample Output 2: Go



 */

package com.kn.SwitchCase;

import java.util.Scanner;

public class DrivingSchool {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Traffic Signal Color(Red/Yellow/Green): ");
		
		String signal = s.nextLine();
			
		isTrafficColor(signal);
		
		s.close();
	}

	static void isTrafficColor(String signal) {
		switch(signal) {
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
			
			default:
				System.out.println("enter valid color");
				break;
		}
	}



}


