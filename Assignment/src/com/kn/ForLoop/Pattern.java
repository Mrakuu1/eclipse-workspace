package com.kn.ForLoop;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int S= s.nextInt();
		
		printPattern(S);
		s.close();
	}

	 static void printPattern(int s) {
		 for(int i=0; i<=s;i++)
		 {
		    
			 
			 for(int j=1; j<=s-i; j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	}

}
