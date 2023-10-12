package com.kn.patterns;

public class IncreasingColumnNumbersInRightAngleTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j<=5; j++) {
				if(j<=i) {
					System.out.print(j+ " ");
				}else {
					System.out.print(" ");
				}
			}
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j+" ");
//				printing Alphabets
//				System.out.print((char)(j+64) + " ");
//			}	
			System.out.println();
		}
	}

}
