package com.kn.integertoroman;

public class IntToString {
	public void intToRoman(int num) {
		
		int[] arr = {1000, 900, 500, 400, 100,90, 50, 40, 10, 9, 5, 4, 1};
		
		String[] srr = {"M", "CM", "D", "CD", "C", "XC", "L","XL","X","IX","V","IV","I" };
		
		StringBuffer result = new StringBuffer();
		for(int i=0; i<arr.length; i++) {
			while(num >= arr[i]) {
				num = num-arr[i];
				result.append(srr[i]);
			}
		}
		System.out.println(result.toString());
	}

}
