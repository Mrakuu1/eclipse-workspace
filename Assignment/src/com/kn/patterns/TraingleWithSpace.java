package com.kn.patterns;

public class TraingleWithSpace {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) 
		{
			int k=1;
			for(int j=1; j<=9; j++)
			{
				if(j>=(6-i) && j<=(i+4)&&k==1) 
				{
					System.out.print("*");	
					k=0;
				}
				else
				{
					System.out.print(" ");
					k=1;
				}
				
			}
			System.out.println();
		}
	}

}
