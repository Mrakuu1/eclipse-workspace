package com.kn.factorial;

public class Factorial {
	// method to find factorial of the number
	public int findFactorial(int number) {

		if (number == 1) {
			return 1;
		} else {
			return number * findFactorial(number - 1);
		}

	}

}
