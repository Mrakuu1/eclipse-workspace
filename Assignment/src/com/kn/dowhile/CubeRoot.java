package com.kn.dowhile;

import java.util.Scanner;

public class CubeRoot {

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number to find the CubeRoot : ");

		int num = s.nextInt();

		int res = (int)findCubeRoot(num);
		
		System.out.println("The CubeRoot of " + num +" is "+res);
		
		s.close();
	}

	 static double findCubeRoot(int num) {
		double cbrt = Math.cbrt(num);
		 return cbrt;

	}

}
