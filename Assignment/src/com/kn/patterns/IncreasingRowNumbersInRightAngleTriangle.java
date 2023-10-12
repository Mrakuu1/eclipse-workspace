package com.kn.patterns;

public class IncreasingRowNumbersInRightAngleTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
//				printing numbers
				System.out.print(i+" ");
//				printing Alphabets
//				System.out.print((char)(i+64) + " ");
			}
			System.out.println();
		}
	}

}
