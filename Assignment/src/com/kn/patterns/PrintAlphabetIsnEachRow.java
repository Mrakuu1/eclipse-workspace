package com.kn.patterns;

public class PrintAlphabetIsnEachRow {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++) 
			{
				//printing Alphabets row wise(using UniCode of Char)
				System.out.print((char)(i+64)+ " ");
			}
			System.out.println();
		}
	}

}
