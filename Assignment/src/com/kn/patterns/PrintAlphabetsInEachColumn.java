package com.kn.patterns;

public class PrintAlphabetsInEachColumn {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++) 
			{
				//printing Alphabets column wise(using UniCode of Char)
				System.out.print((char)(j+64)+ " ");
			}
			System.out.println();
		}
	}

}
