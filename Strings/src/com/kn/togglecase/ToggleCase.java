package com.kn.togglecase;

public class ToggleCase {
	public void toggleCharCase(String s1) {
		char[] crr = s1.toCharArray();

		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {
				crr[i] = (char) (crr[i] + 32);
			} else if (crr[i] >= 97 && crr[i] <= 122) {
				crr[i] = (char) (crr[i] - 32);
			}
		}

		StringBuffer sb = new StringBuffer();

		for (char c : crr) {
			sb.append(c);
		}

		System.out.println(sb);
	}

}
