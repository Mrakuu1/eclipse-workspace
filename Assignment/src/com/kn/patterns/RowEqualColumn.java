package com.kn.patterns;

public class RowEqualColumn {

	public static void main(String[] args) {
		//outer loop or Row
		for(int i=5; i>=1; i--) {
			//inner loop or column
			for (int j=1;j<=5; j++) {
//				print *
//				System.out.print("*");
				
//				print i value
//				System.out.print(i+" ");
				
//				print j value
//				System.out.print(j+" ");
				
//				print alphabet increasing in row 
				System.out.print((char)(i+64)+ " ");
				
//				print alphabet incresing in column
//				System.out.print((char)(j+64)+" ");
			}
			//print in next line after execution of inner loop
			System.out.println();
		}
	}

}
