package com.kn.patterns;

public class PrintColumnValue {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++) 
			{
				//printing column value in loop
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
