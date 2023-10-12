package com.kn.arrays;

public class ArrayAfterMerging {

	public void mergeTwoArrays(int[] arr, int[] brr, int[] crr) {
		int[] drr = new int[arr.length + brr.length + crr.length];

		System.out.println("The array elments after Merging");
		for (int i = 0; i < arr.length; i++) {
			drr[i] = arr[i];

		}
		for (int i = 0; i < brr.length; i++) {

			drr[i + arr.length] = brr[i];

		}

		for (int i = 0; i < crr.length; i++) {

			drr[i + arr.length + brr.length] = crr[i];
		}

		for (int i = 0; i < drr.length; i++) {
			System.out.print(drr[i] + " ");
		}
	}

}
