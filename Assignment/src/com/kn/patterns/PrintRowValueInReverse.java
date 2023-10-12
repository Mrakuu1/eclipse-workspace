package com.kn.patterns;

public class PrintRowValueInReverse {

	public static void main(String[] args) {
		for(int i=5; i>=1; i--)
		{
			for (int j=1; j<=5; j++) 
			{
				//printing row value in reverse
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
