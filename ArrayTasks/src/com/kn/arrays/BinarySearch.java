package com.kn.arrays;

public class BinarySearch {
	public void IsNumberPresent(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;

		boolean isFound = false;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == num) {
				isFound = true;
				break;
			} else if (num > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if(isFound == true) {
		System.out.println(num +" is found from above array list");
		}else {
			System.out.println(num+ " is not found from above array list");
		}
	}
}
